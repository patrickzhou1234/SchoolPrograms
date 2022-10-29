public class Computer{
  // computer specification 
  private int specs1;
  private int specs2;
  private int specs3;
  private int cpu;
  private int gpu;
  private int memory;
  public Computer(){
    specs1=0;
    specs2=0;
    specs3=0;
    cpu=0;
    gpu=0;
    memory=0;
  }
  public Computer(int specsx, int specsy, int specsz, int c, int g, int mem){
    specs1=specsx;
    specs2=specsy;
    specs3=specsz;
    cpu=c;
    gpu=g;
    memory=mem;
  }
  public void setspecs(int specsx, int specsy, int specsz){
    specs1=specsx;
    specs2=specsy;
    specs3=specsz;
 
  }
  public int findspecsx(){
    return specs1;
  }
  public int findspecsy(){
    return specs2;
  }
  public int findspecsz(){
    return specs3;
  }
  public void setcpu(int c){
    cpu=c;
  }
  public void setgpu(int g){
    gpu=g;
  }
  public void setmemory(int m){
    memory=m;
  }
  public int findcpu(){
    return cpu;
  }
  public int findgpu(){
    return gpu;
  }
  public int findmemory(){
    return memory;
  }
  String stateofComputer(){
    return " has specs "+specs1+" by "+specs2+" by "+specs3+", and has "+cpu+" cpu, "+gpu+" gpu, and "+memory+" memory.";
  }
} 