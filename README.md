This repository hosts Eclipse-related files for the Enabling Evidence-Based Modernization research project.

With this tool one can create modernization models for export to the @ai-se group's Differential Evolution tool [pygoal](https://github.com/ai-se/softgoals).

To build, download Eclipse-Mars, update build.xml to your local installation directory, and run `ant`.

This puts a jar in the top directory. `java -jar eebm-compiler.jar <file>.eebm` will compile the EEBM model file down to pystar. You can find some samples in edu.cmu.sei.eebm/files/

To work with the source, you will need Eclipse-Mars and Xtext. 