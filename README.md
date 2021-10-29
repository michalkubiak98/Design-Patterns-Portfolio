# Design-Patterns-Portfolio
Design Patterns Portfolio Project

Template Method is a behavioral design pattern that defines the skeleton of an algorithm in the superclass but lets subclasses override specific steps of the algorithm without changing its structure.

In this implementation of the Template Pattern, we create a RecordActivities class which 'records' a user's activities, we have a Task abstract class which has a default constructor with the RecordActivities object reference, a public execute method which calls the record() method and which also calls the protected abstract callExecute method which can be overritten by any concrete class which extends this abstarct Task class.
