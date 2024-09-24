package stackandqueue.kunalkushwa;

public class Dynamicstack extends Customstack{
    public Dynamicstack(){
        super();
    }
    public Dynamicstack(int size){
        super(size);
    }
    @Override
    public boolean push(int item){
        if(this.isfull()){
            int[] temp=new int[data.length*2];//double the size
            //copy all previous
            for(int i=0;i<data.length;i++){
                temp[i]=data[i];
            }
            data=temp;
        }
        return super.push(item);
    }
}
