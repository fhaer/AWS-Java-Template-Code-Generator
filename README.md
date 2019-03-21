# Model-Driven JavaEE Source Code Generation from Eclipse EMF

Starting from systems specification models of the Semantic Object Model (SOM), this tool encompasses the specification of services and their transformation to JavaEE EJB-based services, entities with object-relational (OR) database mappings and configuration files for the GlassFish application server. Services communicate using java message queues and can thus be deployed in a distributed fashion.

The transformation involves three layers. An AwS model is a system specification using the KOS and VOS schemas of SOM. These schemas can be written in a domain-specific programming language, for which a parser was created to convert them to Eclipse EMF. In EMF, a transformation specified in the QVTo language of the OMG generates an initial version of the service specification. It is in the form of an EMF model, which can be altered to detail and augment the services to be created. Services are specified here as part of a reference SOA architecture, which involves services, their coordination using message queues and entities. This so-called architecture model is then the basis for a template-based source-code generation of EJB-based JavaEE services, entities and according configuration files for OR-mapping with EclipseLink through JPA and files for configuring GlassFish. More information is available here: https://doi.org/10.20378/irbo-50808 .

<img src="https://raw.githubusercontent.com/fhaer/AWS-Java-Template-Code-Generator/master/Architecture-Overview.png" width="50%" height="50%" />

The following examples show a simple initial KOS and VOS specification together with the resulting service classes and entities:

<img src="https://raw.githubusercontent.com/fhaer/AWS-Java-Template-Code-Generator/master/Example-Process-Service-Definition.png" width="50%" height="50%" />

<img src="https://raw.githubusercontent.com/fhaer/AWS-Java-Template-Code-Generator/master/Example-Entity-Classes.png" width="70%" height="70%" />

<img src="https://raw.githubusercontent.com/fhaer/AWS-Java-Template-Code-Generator/master/Example-Service-Class.png" width="55%" height="55%" />
