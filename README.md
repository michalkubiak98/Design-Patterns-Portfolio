# Design-Patterns-Portfolio
Design Patterns Portfolio Project


In this branch we are working on a possible file reader class which checks for compression and filter types. The initial class violates the Single Responsibility Principle and we are now ging to apply a solution and apply the Startegy Design Pattern to make the class more maintainable, and flexible.

Implemented the Strategy Pattern in this branch, a file reader which referenced two concrete classes ( JPEGCompression and Black And White Filer ) which implmeneted their coresponding interfaces. The file was a string, but the filters and compressions were succesfully 'applied' to the file, and the algorithms, which were for simplicity reasosns just system out prints, were applied to the file passed in he main class fileReader.storeFile method.
