# OOPS Concepts - Core Java ☕

This directory contains programs demonstrating the core concepts of Object-Oriented Programming (OOPS).

---

## 📁 Project Structure

```text
core-java/
├── 📁 src/
│   └── 📁 com/corejava/oops/
│       ├── 📁 module1_core/          # Encapsulation, Abstraction, Data Hiding
│       ├── 📁 module2_inheritance/   # IS-A relationship, Multilevel, Hierarchical
│       ├── 📁 module3_polymorphism/  # Overloading, Overriding, HAS-A, Casting
│       ├── 📁 module4_constructors/  # Rules, Overloading, super()/this() 
│       ├── 📁 module4_executionflow/ # Static & Instance Control Flow
│       ├── 📁 module5_design/        # Coupling, Cohesion, Singleton
│       └── 📁 module6_typecasting/   # Upcasting, Downcasting, Mantra rules
├── 📁 notes/
│   └── 📁 oops/
│       └── 📝 README.md              # OOPS Documentation (this file)
└── 📝 README.md (Root)
```

## 📁 Modules

### 🔹 Module 1: Core Concepts (`com.corejava.oops.module1_core`)

| Class Name | Description |
| :--- | :--- |
| [`Student`](../../src/com/corejava/oops/module1_core/Student.java) | Demonstrates **Encapsulation** by using private data members and public getters/setters. |
| [`Account`](../../src/com/corejava/oops/module1_core/Account.java) | Demonstrates **Data Hiding** by restricting direct access to fields. |
| [`Bank`](../../src/com/corejava/oops/module1_core/Bank.java) | Abstract class demonstrating **Abstraction** by hiding implementation details. |
| [`DataHidingDemo`](../../src/com/corejava/oops/module1_core/DataHidingDemo.java) | Test class to demonstrate valid vs invalid access modification for Data Hiding. |
| [`AbstractionDemo`](../../src/com/corejava/oops/module1_core/AbstractionDemo.java) | Demonstrates **Abstraction** using polymorphic calls on abstract class reference. |
| [`EncapsulationDemo`](../../src/com/corejava/oops/module1_core/EncapsulationDemo.java) | Demonstrates **Encapsulation** by setting and getting values through methods. |
| [`TightlyEncapsulatedClass`](../../src/com/corejava/oops/module1_core/TightlyEncapsulatedClass.java) | Example of a tightly encapsulated class where all variables are private. |
| [`NotTightlyEncapsulatedParent`](../../src/com/corejava/oops/module1_core/NotTightlyEncapsulatedParent.java) | Parent class with `protected` members, making it NOT tightly encapsulated. |
| [`NotTightlyEncapsulatedInheritedChild`](../../src/com/corejava/oops/module1_core/NotTightlyEncapsulatedInheritedChild.java) | Child class that inherits non-private members, hence NOT tightly encapsulated. |
| [`SBI`](../../src/com/corejava/oops/module1_core/SBI.java) | Concrete implementation of `Bank` abstract class. |
| [`HDFC`](../../src/com/corejava/oops/module1_core/HDFC.java) | Concrete implementation of `Bank` abstract class. |

### 🔹 Module 2: Inheritance (`com.corejava.oops.module2_inheritance`)

| Class Name | Description |
| :--- | :--- |
| [`Parent`](../../src/com/corejava/oops/module2_inheritance/Parent.java) | Base class representing the parent in an IS-A relationship. |
| [`Child`](../../src/com/corejava/oops/module2_inheritance/Child.java) | Child class extending `Parent`, demonstrating method overriding. |
| [`ParentChildDemo`](../../src/com/corejava/oops/module2_inheritance/ParentChildDemo.java) | Demonstrates polymorphic behavior using Parent reference and Child object. |
| [`GrandParent`](../../src/com/corejava/oops/module2_inheritance/GrandParent.java) | Top-level class for Multilevel Inheritance demo. |
| [`ParentLevel`](../../src/com/corejava/oops/module2_inheritance/ParentLevel.java) | Intermediate parent class for Multilevel Inheritance. |
| [`ChildLevel`](../../src/com/corejava/oops/module2_inheritance/ChildLevel.java) | Leaf class in Multilevel Inheritance chain. |
| [`MultilevelInheritanceDemo`](../../src/com/corejava/oops/module2_inheritance/MultilevelInheritanceDemo.java) | Demonstrates Multilevel Inheritance (GrandParent -> Parent -> Child). |
| [`ParentCommon`](../../src/com/corejava/oops/module2_inheritance/ParentCommon.java) | Common parent for Hierarchical Inheritance. |
| [`ChildOne`](../../src/com/corejava/oops/module2_inheritance/ChildOne.java) | First child class in Hierarchical Inheritance. |
| [`ChildTwo`](../../src/com/corejava/oops/module2_inheritance/ChildTwo.java) | Second child class in Hierarchical Inheritance. |
| [`HierarchicalInheritanceDemo`](../../src/com/corejava/oops/module2_inheritance/HierarchicalInheritanceDemo.java) | Demonstrates Hierarchical Inheritance (Parent -> ChildOne, ChildTwo). |
| [`CyclicInheritanceDemo`](../../src/com/corejava/oops/module2_inheritance/CyclicInheritanceDemo.java) | Demonstrates that Cyclic Inheritance is NOT allowed in Java. |
| [`MultipleInheritanceClassDemo`](../../src/com/corejava/oops/module2_inheritance/MultipleInheritanceClassDemo.java) | shows that Multiple Inheritance with classes is NOT supported. |
| [`InterfaceA`](../../src/com/corejava/oops/module2_inheritance/InterfaceA.java) | First interface for Multiple Inheritance demo. |
| [`InterfaceB`](../../src/com/corejava/oops/module2_inheritance/InterfaceB.java) | Second interface for Multiple Inheritance demo. |
| [`InterfaceMultipleInheritanceDemo`](../../src/com/corejava/oops/module2_inheritance/InterfaceMultipleInheritanceDemo.java) | Demonstrates Multiple Inheritance using Interfaces. |
| [`ObjectClassDemo`](../../src/com/corejava/oops/module2_inheritance/ObjectClassDemo.java) | Demonstrates `Object` class methods (`hashCode`, `toString`, `getClass`). |

### 🔹 Module 3: Polymorphism (`com.corejava.oops.module3_polymorphism`)

| Class Name | Description |
| :--- | :--- |
| [`MethodSignatureDemo`](../../src/com/corejava/oops/module3_polymorphism/MethodSignatureDemo.java) | Demonstrates that method signature includes name and parameter types only. |
| [`MethodOverloadingDemo`](../../src/com/corejava/oops/module3_polymorphism/MethodOverloadingDemo.java) | Demonstrates **Compile-time Polymorphism** (Method Overloading). |
| [`MethodOverridingDemo`](../../src/com/corejava/oops/module3_polymorphism/MethodOverridingDemo.java) | Demonstrates **Runtime Polymorphism** (Method Overriding). |
| [`ParentOverride`](../../src/com/corejava/oops/module3_polymorphism/ParentOverride.java) | Parent class for overriding demo. |
| [`ChildOverride`](../../src/com/corejava/oops/module3_polymorphism/ChildOverride.java) | Child class overriding parent method. |
| [`StaticParent`](../../src/com/corejava/oops/module3_polymorphism/StaticParent.java) | Parent class with static method. |
| [`StaticChild`](../../src/com/corejava/oops/module3_polymorphism/StaticChild.java) | Child class with static method (Method Hiding). |
| [`MethodHidingDemo`](../../src/com/corejava/oops/module3_polymorphism/MethodHidingDemo.java) | Demonstrates **Method Hiding** using static methods. |
| [`VariableParent`](../../src/com/corejava/oops/module3_polymorphism/VariableParent.java) | Parent class with instance variable. |
| [`VariableChild`](../../src/com/corejava/oops/module3_polymorphism/VariableChild.java) | Child class with same instance variable name. |
| [`VariablePolymorphismDemo`](../../src/com/corejava/oops/module3_polymorphism/VariablePolymorphismDemo.java) | Shows that variable resolution is based on reference type, not object type. |
| [`Person`](../../src/com/corejava/oops/module3_polymorphism/Person.java) | Parent class for IS-A relationship. |
| [`Student`](../../src/com/corejava/oops/module3_polymorphism/Student.java) | Child class extending Person (IS-A). |
| [`Engine`](../../src/com/corejava/oops/module3_polymorphism/Engine.java) | Component class for HAS-A relationship. |
| [`Car`](../../src/com/corejava/oops/module3_polymorphism/Car.java) | Class using Engine (HAS-A). |
| [`Professor`](../../src/com/corejava/oops/module3_polymorphism/Professor.java) | Independent class for Aggregation. |
| [`Department`](../../src/com/corejava/oops/module3_polymorphism/Department.java) | Department HAS-A Professor (Weak Association / Aggregation). |
| [`AggregationDemo`](../../src/com/corejava/oops/module3_polymorphism/AggregationDemo.java) | Demonstrates **Aggregation**. |
| [`EngineComponent`](../../src/com/corejava/oops/module3_polymorphism/EngineComponent.java) | Engine component for Composition. |
| [`CarComposition`](../../src/com/corejava/oops/module3_polymorphism/CarComposition.java) | Car HAS-A Engine (Strong Association / Composition). |
| [`CompositionDemo`](../../src/com/corejava/oops/module3_polymorphism/CompositionDemo.java) | Demonstrates **Composition**. |
| [`HasARelationshipDemo`](../../src/com/corejava/oops/module3_polymorphism/HasARelationshipDemo.java) | General demo for HAS-A relationship. |

### 🔹 Module 4: Constructors (`com.corejava.oops.module4_constructors`)

| Class Name | Description |
| :--- | :--- |
| [`DefaultConstructorDemo`](../../src/com/corejava/oops/module4_constructors/DefaultConstructorDemo.java) | Demonstrates default constructor generation by compiler. |
| [`ConstructorRulesDemo`](../../src/com/corejava/oops/module4_constructors/ConstructorRulesDemo.java) | Shows rules for constructor naming and return types. |
| [`ConstructorInitializationDemo`](../../src/com/corejava/oops/module4_constructors/ConstructorInitializationDemo.java) | Demonstrates object initialization using constructors. |
| [`OverloadedConstructorsDemo`](../../src/com/corejava/oops/module4_constructors/OverloadedConstructorsDemo.java) | Demonstrates Constructor Overloading. |
| [`SuperThisRulesDemo`](../../src/com/corejava/oops/module4_constructors/SuperThisRulesDemo.java) | rules for `super()` and `this()` constructor calls. |
| [`RecursiveConstructorDemo`](../../src/com/corejava/oops/module4_constructors/RecursiveConstructorDemo.java) | Shows that recursive constructor calls are invalid. |
| [`ConstructorInheritanceDemo`](../../src/com/corejava/oops/module4_constructors/ConstructorInheritanceDemo.java) | Demonstrates how parent constructors are called from child. |
| [`ConstructorExceptionDemo`](../../src/com/corejava/oops/module4_constructors/ConstructorExceptionDemo.java) | Rules for exception handling in constructors. |
| [`ConstructorVsInstanceBlockDemo`](../../src/com/corejava/oops/module4_constructors/ConstructorVsInstanceBlockDemo.java) | differences between Constructor and Instance Block. |
| [`SingletonClassDemo`](../../src/com/corejava/oops/module4_constructors/SingletonClassDemo.java) | Implementing Singleton pattern using private constructor. |

### 🔹 Module 4: Execution Flow (`com.corejava.oops.module4_executionflow`)

| Class Name | Description |
| :--- | :--- |
| [`StaticBlockPurposeDemo`](../../src/com/corejava/oops/module4_executionflow/StaticBlockPurposeDemo.java) | Shows execution of static blocks during class loading. |
| [`WithoutMainStaticBlockDemo`](../../src/com/corejava/oops/module4_executionflow/WithoutMainStaticBlockDemo.java) | (Pre-Java 7) Printing from static block without main method. |
| [`StaticControlFlowDemo`](../../src/com/corejava/oops/module4_executionflow/StaticControlFlowDemo.java) | Detailed flow of static variable assignment and static block execution. |
| [`StaticVsInstanceDemo`](../../src/com/corejava/oops/module4_executionflow/StaticVsInstanceDemo.java) | Execution order: Static Block -> Instance Block -> Constructor. |
| [`InstanceControlFlowDemo`](../../src/com/corejava/oops/module4_executionflow/InstanceControlFlowDemo.java) | Detailed flow of instance variable assignment and instance block execution. |
| [`ParentInstance`](../../src/com/corejava/oops/module4_executionflow/ParentInstance.java) | Parent class for instance flow inheritance. |
| [`ChildInstance`](../../src/com/corejava/oops/module4_executionflow/ChildInstance.java) | Child class demonstrating instance control flow with inheritance. |
| [`StaticAccessInstanceDemo`](../../src/com/corejava/oops/module4_executionflow/StaticAccessInstanceDemo.java) | Demonstrates that static area cannot access instance members directly. |
| [`ObjectCreationDemo`](../../src/com/corejava/oops/module4_executionflow/ObjectCreationDemo.java) | Simple object creation demo. |
| [`RIWODemo`](../../src/com/corejava/oops/module4_executionflow/RIWODemo.java) | Demonstrates "Read Indirectly Write Only" state of variables. |
| [`IllegalForwardReferenceDemo`](../../src/com/corejava/oops/module4_executionflow/IllegalForwardReferenceDemo.java) | Demonstrates Illegal Forward Reference error. |

### 🔹 Module 5: Design (`com.corejava.oops.module5_design`)

| Class Name | Description |
| :--- | :--- |
| [`TightlyCoupledEngine`](../../src/com/corejava/oops/module5_design/TightlyCoupledEngine.java) | Engine implementation tied to specific car. |
| [`TightlyCoupledCar`](../../src/com/corejava/oops/module5_design/TightlyCoupledCar.java) | Car class that creates its own Engine dependency (Tight Coupling). |
| [`TightCouplingDemo`](../../src/com/corejava/oops/module5_design/TightCouplingDemo.java) | Demonstrates disadvantages of Tight Coupling. |
| [`Engine`](../../src/com/corejava/oops/module5_design/Engine.java) | Interface for loose coupling. |
| [`PetrolEngine`](../../src/com/corejava/oops/module5_design/PetrolEngine.java) | Implementation of Engine. |
| [`DieselEngine`](../../src/com/corejava/oops/module5_design/DieselEngine.java) | Implementation of Engine. |
| [`LooseCoupledCar`](../../src/com/corejava/oops/module5_design/LooseCoupledCar.java) | Car class that accepts Engine via constructor (Loose Coupling). |
| [`LooseCouplingDemo`](../../src/com/corejava/oops/module5_design/LooseCouplingDemo.java) | Demonstrates Loose Coupling using DI principle. |
| [`LowCohesionDemo`](../../src/com/corejava/oops/module5_design/LowCohesionDemo.java) | Class with multiple unrelated responsibilities (Low Cohesion). |
| [`LowCohesionService`](../../src/com/corejava/oops/module5_design/LowCohesionService.java) | Client using low cohesion class. |
| [`HighCohesionSalaryService`](../../src/com/corejava/oops/module5_design/HighCohesionSalaryService.java) | Service dedicated to salary calculation. |
| [`HighCohesionDatabaseService`](../../src/com/corejava/oops/module5_design/HighCohesionDatabaseService.java) | Service dedicated to database operations. |
| [`HighCohesionEmailService`](../../src/com/corejava/oops/module5_design/HighCohesionEmailService.java) | Service dedicated to distinct email operations. |
| [`HighCohesionDemo`](../../src/com/corejava/oops/module5_design/HighCohesionDemo.java) | Demonstrates High Cohesion by separating concerns. |

### 🔹 Module 6: Type Casting (`com.corejava.oops.module6_typecasting`)

| Class Name | Description |
| :--- | :--- |
| [`Parent`](../../src/com/corejava/oops/module6_typecasting/Parent.java) | Base class for casting demos. |
| [`Child`](../../src/com/corejava/oops/module6_typecasting/Child.java) | Derived class for casting demos. |
| [`UpCastingDemo`](../../src/com/corejava/oops/module6_typecasting/UpCastingDemo.java) | Demonstrates Upcasting (Parent p = new Child()). |
| [`DownCastingDemo`](../../src/com/corejava/oops/module6_typecasting/DownCastingDemo.java) | Demonstrates Downcasting (Child c = (Child) p). |
| [`InvalidCastingCompileTime`](../../src/com/corejava/oops/module6_typecasting/InvalidCastingCompileTime.java) | Casting between unrelated classes ends in compile error. |
| [`InvalidCastingRuntime`](../../src/com/corejava/oops/module6_typecasting/InvalidCastingRuntime.java) | Invalid downcasting leads to `ClassCastException`. |
| [`MantraBasedTypeCastingDemo`](../../src/com/corejava/oops/module6_typecasting/MantraBasedTypeCastingDemo.java) | Comprehensive demo of the 3 rules (Mantras) of casting. |
| [`MethodResolutionCastingDemo`](../../src/com/corejava/oops/module6_typecasting/MethodResolutionCastingDemo.java) | Shows how casting affects method resolution. |
| [`VariableCastingDemo`](../../src/com/corejava/oops/module6_typecasting/VariableCastingDemo.java) | Shows how casting affects variable access. |
| [`StaticMethodCastingDemo`](../../src/com/corejava/oops/module6_typecasting/StaticMethodCastingDemo.java) | Shows how casting affects static method access. |

---

## 📝 Notes

*   **Encapsulation**: Binding data and methods together.
*   **Inheritance**: Acquiring properties of parent class.
*   **Polymorphism**: Ability to take many forms (Overloading/Overriding).
*   **Abstraction**: Hiding internal details.
*   **Coupling**: Degree of dependency between components (Loose is better).
*   **Cohesion**: Degree to which elements inside a module belong together (High is better).
