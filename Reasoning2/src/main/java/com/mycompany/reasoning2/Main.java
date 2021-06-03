/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.reasoning2;

/**
 *
 * @author Administrator
 */
import java.util.Iterator;
import org.apache.jena.rdf.model.InfModel;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Property;
import org.apache.jena.rdf.model.RDFNode;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.Statement;
import org.apache.jena.rdf.model.StmtIterator;
import org.apache.jena.reasoner.Reasoner;
import org.apache.jena.reasoner.ValidityReport;
import org.apache.jena.reasoner.rulesys.GenericRuleReasoner;
import org.apache.jena.reasoner.rulesys.Rule;

public class Main {
    
 /**
     * @param args the command line arguments
     */
    static void console(String s){
       System.out.println(s); 
    }
    
     static void checkModel(InfModel infModel){
       ValidityReport validity = infModel.validate();
    if (validity.isValid()) {
    console("************** Model is Ok******************************");
} else {
    console("****************Conflicts in model*****************");
    for (Iterator i = validity.getReports(); i.hasNext(); ) {
        console(" - " + i.next());
    }
}
    }
    public static void main(String[] args) 
    {
        String path="d:/java/dataset/";
        console("test");
    
     Model model = ModelFactory.createDefaultModel();
     model.read(path+"dataset.n3");
     
     Reasoner reasoner=new GenericRuleReasoner(Rule.rulesFromURL( path+"rules.txt" ));
     InfModel infModel = ModelFactory.createInfModel( reasoner, model );
     
      checkModel(infModel);
        StmtIterator it = infModel.listStatements();
        
        while ( it.hasNext() )
        {
            Statement stmt = it.nextStatement();
            
            Resource subject = stmt.getSubject();
            Property predicate = stmt.getPredicate();
            RDFNode object = stmt.getObject();
            console( subject.toString() + " " + predicate.toString() + " " + object.toString() );
     
    
}
}
}
