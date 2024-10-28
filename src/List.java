public class List {
    private final Student head;
    private int listCount;
    public List() {
        this.head = new Student();
        listCount = 0;
    }
    public boolean isEmpty(){
        return head.getNext() == null;
    }
    public void add(){
        Student tmp = new Student();
        tmp.inputInfo();
        Student current = this.head;
        while (current.getNext() != null){
            current = current.getNext();
        }
        current.setNext(tmp);
        listCount++;
    }
    public void add(int index){
        Student tmp = new Student();
        tmp.inputInfo();
        Student current = head;
        for (int i=1; i<index && current.getNext() != null; i++){
            current = current.getNext();
        }
        tmp.setNext(current.getNext());
        current.setNext(tmp);
        listCount++;
    }
    public Object get(int index){
        if (Math.abs(index) >= listCount) return null;
        Student current = head.getNext();
        if (index < 0){
            for (int i = 0; i < listCount + index; i++){
                if (current.getNext() == null) return null;
                current = current.getNext();
            }
        }
        else {
            for (int i = 0; i < index; i++) {
                if (current.getNext() == null) return null;
                current = current.getNext();
            }
        }
        return current.getData();
    }
    public void remove(int index){
        if (Math.abs(index) >= listCount) return;
        Student current = head;
        if (index < 0){
            for (int i = 0; i < listCount + index; i++){
                if (current.getNext() == null) return;
                current = current.getNext();
            }
        }
        else {
            for (int i = 0; i < index; i++) {
                if (current.getNext() == null) return;
                current = current.getNext();
            }
        }
        if (index == listCount-1 || index == -1){
            current.setNext(null);
        }else{
            current.setNext(current.getNext().getNext());
        }
        listCount--;
    }
    public void clear(){
        head.setNext(null);
    }
    public int size(){ return listCount; }
    @Override
    public String toString() {
        if (head.getNext() == null){
            return "всех студентов отчислили";
        }else {
            Student current = head.getNext();
            String output = "";
            while (current != null){
                output += "[" + current.getData().toString() + "]";
                current = current.getNext(); }
            return output;
        }

    }
}
