package Tree.Binaryheap;

//we impliment using array so we insert at last position then
//compare with its parent
public class Insert {
void insert(int x){
   if(size==capacity) return;
   size++; arr[size-1]=x;
   for(int i=size-1;i!=0&&arr[parent[i]]>arr[i]){
    swap(arr[i],arr[parent(i)]);
    i=parent(i);
   }
}
}
