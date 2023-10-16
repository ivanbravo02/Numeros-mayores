package BusquedayOrdenamineto;

public class SoutingandSearch <T extends Comparable>{
    //busqueda lineal
    public boolean linealSearch(T[]data, int min, int max, T target){
        int index=min;
        boolean found=false;

        while(!found && index<=max){
            if(data[index].compareTo(target)==0){
                found=true;
            }
            index++;
        }
        return found;
    }    



//busqueda binaria
public boolean binarySearch (T[]data, int min, int max, T target){
    //-1 cuando el valor es menor , 0= cuando el valor es igual, -1= cunado el valor es mayor
    boolean found=false;
    int mindpoint=(min+max)/2;
    if(data[mindpoint].compareTo(target)==0){
        found=true;
    }else if(data[mindpoint].compareTo(target)>0)
    if(min<=mindpoint-1){
        found=binarySearch(data, mindpoint-1, max, target);
    }else if(mindpoint+1<=max){
        found=binarySearch(data, mindpoint+1, max, target);
    }
    return found;
    }

//ordenamineto por seleccion 
    public void selectionSort(T[]data){
    int min;
    T temp;
    for (int index=0; index< data.length-1; index++){
        min=index;
            for (int scan=index+1; scan< data.length;scan++){
                if(data[scan].compareTo(data)[min]<0){
                    min 
                }
            }
        }
    }
//ordenamineto por inserccion
    public void inserSort(T[]data){
        for (int index=1; index<data.length;index++){
            T key=data
        }
    }
}
