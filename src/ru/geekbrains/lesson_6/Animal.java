package ru.geekbrains.lesson_6;

     public abstract class Animal {

        protected String name;
        protected int runLimit;
        protected double jumpLimit;
        protected int swimLimit;


        public Animal(String name, int runLimit, int swimLimit, double jumpLimit) {
            this.name = name;
            this.runLimit = runLimit;
            this.swimLimit = swimLimit;
            this.jumpLimit = jumpLimit;
        }

        public Animal(String name, int runLimit, double jumpLimit) {
            this.name = name;
            this.runLimit = runLimit;
            this.jumpLimit = jumpLimit;
        }

        public void grp(int run, double jump, int swim) {
            System.out.println(name);
            run(run);
            jump(jump);
            swim(swim);
            System.out.println();
        }
        //.
        public boolean run(int run) {
            if (run <= runLimit) {
                System.out.println("run:" + true);
            }else
                System.out.println("run:" + false);
            return false;
        }

        public boolean jump(double jump) {
            if (jump <= jumpLimit) {
                System.out.println("jump:" + true);
            }else
                System.out.println("jump:" + false);
            return false;
        }
        public boolean swim(int swim) {
            if (swim <= swimLimit) {
                System.out.println("jump:" + true);
            } else if (swimLimit == 0) {
                System.out.println("Cat can't swim.");
            } else
                System.out.println("swim:" + false);
            return false;
        }

    }

