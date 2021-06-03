# ReasoningExample
 Reasoning to infer new statements
 

**Use Case**
=======


![bundle attributes](images/image.jpg)

•	Organization A has a dataset (D) and it is obliged to share data for research purpose. 
•	In order to share dataset (D), organization A has received consent (C) for data subjects in order to share with research lab (lab 1)
•	Later lab 2 want to acquire this data for research purpose (Assumption: Lab 2 research work is like lab 1) \
**Question: How we can represent this formalism for the reasoning?**
**Solution: **
**Step:1** Represent the situation using provenance in RDF/OWL (this is called model or dataset). This formalism can be found in dataset folder with name dataset.n3 \

**Step: 2** Develop the user defined rules (this is called rules set) .The ruels set fiel can be found in dataset folder with name rules.txt \

**Step: 3** Develop code to infer the situation. the main coding file is "main.java". \

if everything goes well  the output should be as : \

http://ukanon.org/adf/example#laboratory_2 \
http://ukanon.org/adf/example#canUse \
http://ukanon.org/adf/example#clinical_trials_dataset 

http://ukanon.org/adf/example#clinical_trials_dataset \
http://ukanon.org/adf/example#concentSignFor \
http://ukanon.org/adf/example#laboratory_1 

http://ukanon.org/adf/example#laboratory_2 \
http://ukanon.org/adf/example#workSameAs \
http://ukanon.org/adf/example#laboratory_1

http://ukanon.org/adf/example#organization-A \
http://ukanon.org/adf/example#obligedToShare \
http://ukanon.org/adf/example#clinical_trials_dataset

http://ukanon.org/adf/example#organization-A  \
http://ukanon.org/adf/example#hasDataSet \
http://ukanon.org/adf/example#clinical_trials_dataset

http://ukanon.org/adf/example#organization-A \
http://www.w3.org/1999/02/22-rdf-syntax-ns#type \
http://www.w3.org/ns/prov#Entity

