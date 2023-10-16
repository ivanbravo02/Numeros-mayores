package Recursividad;

public class TowerofHanoi{
    private int totalDisks; 

public TowerofHanoi(int totalDisks){
    this.totalDisks=totalDisks;
}
    public void solve(){
        moverTower(totalDisks,1,3,2);
    }
    private void moverTower(int numDisks, int start, int end, int temp){
        //numDisk=totalIdscos, start=inicio=1, end=final=3, temp=intermedia
        if(numDisks==1){
            moveOneDisks(start, end);
        }else{
            //toda la logica siguiente para mover el resto de discos
            moverTower(numDisks-1,start,temp,end);
            moveOneDisks(temp, end);
            moveOneDisks(end,temp);
        }
     }
    private void moveOneDisks(int start,int end){
    System.out.println("Move one disks from: " +start+ "or" +end);
    }
}

// busqueda: es el proceso de encontrar un elemento
// conjunto de busqueda es el conjunto de elementos en el que que hay que buscar a un elemento
// tipo de busqueda:
//lineal: es una lista de cualquier tipo debemos comenzar desde el inicio de la lista y comparar
//por turno cada valor en el
//elemento especifico 
//binaria: el conjunto de elementos debe estar ordenado, eliminar partes del conjunto de busqueda
// de comparacion