# Scala: Unexpected Return Type from println in Method

This repository demonstrates a subtle bug in Scala related to the `println` statement's return type within a method that explicitly returns a different type. The example uses a simple class with a greet() method. The bug is revealed when the `println` statement in the method is uncommented.

The code compiles because the Scala compiler does not explicitly enforce that the return type of the method match all paths of the method's execution. This leads to potential issues where the result of the method might not be as expected by the caller.

The solution demonstrates how to avoid this type of bug by ensuring that the method's return statement is executed in all control flow paths.  Furthermore, a preferred way to write the code with a more functional approach is provided.