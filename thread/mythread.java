class mythread extends Thread{
    @Override
    public void run(){
        for(int i=1;i<=3;i++){
            System.out.println("My Thread");
        }
    }
}