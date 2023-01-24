
class Student {

            class Natural {
                public void displayInfo() {
                    System.out.println("I am a Natural Student.");
                }
            }
            static class Social {
                public void displayInfo() {
                    System.out.println("I am a Social Student");
                }
            }
        }

        class Main {
            public static void main(String[] args) {
                // object creation of the outer class
                Student obj = new Student();

                // object creation of the non-static class
                Student.Natural obj1 = obj.new Natural();
                obj1.displayInfo();

                // object creation of the static nested class
                Student.Social obj2 = new Student.Social();
                obj2.displayInfo();

            }
        }

