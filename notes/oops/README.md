# OOPS Concepts - Core Java ☕

This directory contains programs demonstrating the core concepts of Object-Oriented Programming (OOPS).

---

## 📁 Modules

### 🔹 Module 1: Core Concepts (`com.corejava.oops.module1_core`)

| Class Name | Description |
| :--- | :--- |
| `Student` | Demonstrates **Encapsulation** by using private data members and public getters/setters. |
| `Account` | Demonstrates **Data Hiding** by restricting direct access to fields. |
| `Bank` | Abstract class demonstrating **Abstraction** by hiding implementation details. |
| `DataHidingDemo` | Test class to demonstrate valid vs invalid access modification for Data Hiding. |
| `AbstractionDemo` | Demonstrates **Abstraction** using polymorphic calls on abstract class reference. |
| `EncapsulationDemo` | Demonstrates **Encapsulation** by setting and getting values through methods. |
| `TightlyEncapsulatedClass` | Example of a tightly encapsulated class where all variables are private. |
| `NotTightlyEncapsulatedParent` | Parent class with `protected` members, making it NOT tightly encapsulated. |
| `NotTightlyEncapsulatedInheritedChild` | Child class that inherits non-private members, hence NOT tightly encapsulated. |
| `SBI` | Concrete implementation of `Bank` abstract class. |
| `HDFC` | Concrete implementation of `Bank` abstract class. |

### 🔹 Module 2: Inheritance (`com.corejava.oops.module2_inheritance`)

| Class Name | Description |
| :--- | :--- |
| `Parent` | Base class representing the parent in an IS-A relationship. |
| `Child` | Child class extending `Parent`, demonstrating method overriding. |
| `ParentChildDemo` | Demonstrates polymorphic behavior using Parent reference and Child object. |
| `GrandParent` | Top-level class for Multilevel Inheritance demo. |
| `ParentLevel` | Intermediate parent class for Multilevel Inheritance. |
| `ChildLevel` | Leaf class in Multilevel Inheritance chain. |
| `MultilevelInheritanceDemo` | Demonstrates Multilevel Inheritance (GrandParent -> Parent -> Child). |
| `ParentCommon` | Common parent for Hierarchical Inheritance. |
| `ChildOne` | First child class in Hierarchical Inheritance. |
| `ChildTwo` | Second child class in Hierarchical Inheritance. |
| `HierarchicalInheritanceDemo` | Demonstrates Hierarchical Inheritance (Parent -> ChildOne, ChildTwo). |
| `CyclicInheritanceDemo` | Demonstrates that Cyclic Inheritance is NOT allowed in Java. |
| `MultipleInheritanceClassDemo` | shows that Multiple Inheritance with classes is NOT supported. |
| `InterfaceA` | First interface for Multiple Inheritance demo. |
| `InterfaceB` | Second interface for Multiple Inheritance demo. |
| `InterfaceMultipleInheritanceDemo` | Demonstrates Multiple Inheritance using Interfaces. |
| `ObjectClassDemo` | Demonstrates `Object` class methods (`hashCode`, `toString`, `getClass`). |

### 🔹 Module 3: Polymorphism (`com.corejava.oops.module3_polymorphism`)

| Class Name | Description |
| :--- | :--- |
| `MethodSignatureDemo` | Demonstrates that method signature includes name and parameter types only. |
| `MethodOverloadingDemo` | Demonstrates **Compile-time Polymorphism** (Method Overloading). |
| `MethodOverridingDemo` | Demonstrates **Runtime Polymorphism** (Method Overriding). |
| `ParentOverride` | Parent class for overriding demo. |
| `ChildOverride` | Child class overriding parent method. |
| `StaticParent` | Parent class with static method. |
| `StaticChild` | Child class with static method (Method Hiding). |
| `MethodHidingDemo` | Demonstrates **Method Hiding** using static methods. |
| `VariableParent` | Parent class with instance variable. |
| `VariableChild` | Child class with same instance variable name. |
| `VariablePolymorphismDemo` | Shows that variable resolution is based on reference type, not object type. |
| `Person` | Parent class for IS-A relationship. |
| `Student` | Child class extending Person (IS-A). |
| `Engine` | Component class for HAS-A relationship. |
| `Car` | Class using Engine (HAS-A). |
| `Professor` | Independent class for Aggregation. |
| `Department` | Department HAS-A Professor (Weak Association / Aggregation). |
| `AggregationDemo` | Demonstrates **Aggregation**. |
| `EngineComponent` | Engine component for Composition. |
| `CarComposition` | Car HAS-A Engine (Strong Association / Composition). |
| `CompositionDemo` | Demonstrates **Composition**. |
| `HasARelationshipDemo` | General demo for HAS-A relationship. |

### 🔹 Module 4: Constructors (`com.corejava.oops.module4_constructors`)

| Class Name | Description |
| :--- | :--- |
| `DefaultConstructorDemo` | Demonstrates default constructor generation by compiler. |
| `ConstructorRulesDemo` | Shows rules for constructor naming and return types. |
| `ConstructorInitializationDemo` | Demonstrates object initialization using constructors. |
| `OverloadedConstructorsDemo` | Demonstrates Constructor Overloading. |
| `SuperThisRulesDemo` | rules for `super()` and `this()` constructor calls. |
| `RecursiveConstructorDemo` | Shows that recursive constructor calls are invalid. |
| `ConstructorInheritanceDemo` | Demonstrates how parent constructors are called from child. |
| `ConstructorExceptionDemo` | Rules for exception handling in constructors. |
| `ConstructorVsInstanceBlockDemo` | differences between Constructor and Instance Block. |
| `SingletonClassDemo` | Implementing Singleton pattern using private constructor. |

### 🔹 Module 4: Execution Flow (`com.corejava.oops.module4_executionflow`)

| Class Name | Description |
| :--- | :--- |
| `StaticBlockPurposeDemo` | Shows execution of static blocks during class loading. |
| `WithoutMainStaticBlockDemo` | (Pre-Java 7) Printing from static block without main method. |
| `StaticControlFlowDemo` | Detailed flow of static variable assignment and static block execution. |
| `StaticVsInstanceDemo` | Execution order: Static Block -> Instance Block -> Constructor. |
| `InstanceControlFlowDemo` | Detailed flow of instance variable assignment and instance block execution. |
| `ParentInstance` | Parent class for instance flow inheritance. |
| `ChildInstance` | Child class demonstrating instance control flow with inheritance. |
| `StaticAccessInstanceDemo` | Demonstrates that static area cannot access instance members directly. |
| `ObjectCreationDemo` | Simple object creation demo. |
| `RIWODemo` | Demonstrates "Read Indirectly Write Only" state of variables. |
| `IllegalForwardReferenceDemo` | Demonstrates Illegal Forward Reference error. |

### 🔹 Module 5: Design (`com.corejava.oops.module5_design`)

| Class Name | Description |
| :--- | :--- |
| `TightlyCoupledEngine` | Engine implementation tied to specific car. |
| `TightlyCoupledCar` | Car class that creates its own Engine dependency (Tight Coupling). |
| `TightCouplingDemo` | Demonstrates disadvantages of Tight Coupling. |
| `Engine` | Interface for loose coupling. |
| `PetrolEngine` | Implementation of Engine. |
| `DieselEngine` | Implementation of Engine. |
| `LooseCoupledCar` | Car class that accepts Engine via constructor (Loose Coupling). |
| `LooseCouplingDemo` | Demonstrates Loose Coupling using DI principle. |
| `LowCohesionDemo` | Class with multiple unrelated responsibilities (Low Cohesion). |
| `LowCohesionService` | Client using low cohesion class. |
| `HighCohesionSalaryService` | Service dedicated to salary calculation. |
| `HighCohesionDatabaseService` | Service dedicated to database operations. |
| `HighCohesionEmailService` | Service dedicated to distinct email operations. |
| `HighCohesionDemo` | Demonstrates High Cohesion by separating concerns. |

### 🔹 Module 6: Type Casting (`com.corejava.oops.module6_typecasting`)

| Class Name | Description |
| :--- | :--- |
| `Parent` | Base class for casting demos. |
| `Child` | Derived class for casting demos. |
| `UpCastingDemo` | Demonstrates Upcasting (Parent p = new Child()). |
| `DownCastingDemo` | Demonstrates Downcasting (Child c = (Child) p). |
| `InvalidCastingCompileTime` | Casting between unrelated classes ends in compile error. |
| `InvalidCastingRuntime` | Invalid downcasting leads to `ClassCastException`. |
| `MantraBasedTypeCastingDemo` | Comprehensive demo of the 3 rules (Mantras) of casting. |
| `MethodResolutionCastingDemo` | Shows how casting affects method resolution. |
| `VariableCastingDemo` | Shows how casting affects variable access. |
| `StaticMethodCastingDemo` | Shows how casting affects static method access. |

---

## 📝 Notes

*   **Encapsulation**: Binding data and methods together.
*   **Inheritance**: Acquiring properties of parent class.
*   **Polymorphism**: Ability to take many forms (Overloading/Overriding).
*   **Abstraction**: Hiding internal details.
*   **Coupling**: Degree of dependency between components (Loose is better).
*   **Cohesion**: Degree to which elements inside a module belong together (High is better).
