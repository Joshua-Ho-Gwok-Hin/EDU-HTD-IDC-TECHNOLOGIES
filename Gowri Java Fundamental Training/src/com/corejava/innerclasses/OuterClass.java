package com.corejava.innerclasses;

public class OuterClass {

    public class InnerPublic {

        public void innerPublicPublic() {
            System.out.println("Inner Public Class Public Method");
        }

        private void innerPublicPrivate() {
            System.out.println("Inner Public Class Private Method");
        }

        public static void innerPublicPublicStatic() {
            System.out.println("Inner Public Class Public Static Method");
        }

        private static void innerPublicPrivateStatic() {
            System.out.println("Inner Public Class Private Static Method");
        }


    }

    private class InnerPrivate {

        public void innerPrivatePublic() {
            System.out.println("Inner Private Class Public Method");
        }

        private void innerPrivatePrivate() {
            System.out.println("Inner Private Class Private Method");
        }

        public void innerPrivatePublicStatic() {
            System.out.println("Inner Private Class Public Static Method");
        }

        private void innerPrivatePrivateStatic() {
            System.out.println("Inner Private Class Private StaticMethod");
        }

    }

    public void outerPublic() {
        System.out.println("Outer Class Public Method");
    }

    private void outerPrivate() {
        System.out.println("Outer Class Private Method");
    }

    public static void outerPublicStatic() {
        System.out.println("Outer Class Public Static Method");
    }

    private static void outerPrivateStatic() {
        System.out.println("Outer Class Private Static Method");
    }
}


