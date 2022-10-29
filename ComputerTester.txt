import java.util.Scanner;
 
class ComputerTester {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      Computer mycomputer=new Computer(2, 3, 4, 100, 200, 300);
      System.out.println("The first computer"+mycomputer.stateofComputer());
      System.out.println("The first computer's cpu is "+mycomputer.findcpu());
      mycomputer.setcpu(400);
      mycomputer.setmemory(100);
      System.out.println("The first computer"+mycomputer.stateofComputer());
      mycomputer.setmemory(mycomputer.findmemory()+200);
      Computer mynext=new Computer();
      System.out.println("The second computer"+mynext.stateofComputer());
      mycomputer.setspecs(20,13,27);
      System.out.println("The first computer"+mynext.stateofComputer());  
      Computer mylast=new Computer();
      mycomputer.setmemory(200);
      mycomputer.setcpu(300);
      mycomputer.setgpu(500);
      mycomputer.setspecs(24,52,23);
      System.out.println("The last computer"+mylast.stateofComputer());
      Computer usercomputer = new Computer(0, 0, 0, 0, 0, 0);
      System.out.println("Let's build a computer for you. ");
      System.out.print("Input the values of memory, cpu, gpu separated by a space. ");
      int mem, cpu, gpu, specsx, specsy, specsz;
      mem=in.nextInt();
      cpu=in.nextInt();
      gpu=in.nextInt();
      System.out.println("Ok, your computer has "+mem+" memory, "+cpu+" cpu and "+gpu+" gpu. ");
      usercomputer.setmemory(mem);
      usercomputer.setcpu(cpu);
      usercomputer.setgpu(gpu);
      System.out.print("What would your specs be? Input x, y and z dimensions. ");
      specsx=in.nextInt();
      specsy=in.nextInt();
      specsz=in.nextInt();
      in.close();
      usercomputer.setspecs(specsx, specsy, specsz);
      System.out.println("Ok, we've officially built your computer: ");
      System.out.print("Your computer "+usercomputer.stateofComputer());
    }
  }