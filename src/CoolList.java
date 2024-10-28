public class CoolList {
    private final CoolStudent head;
    private final CoolStudent tail;
    private int listCount;
    public CoolList() {
        this.head = new CoolStudent();
        listCount = 0;
        this.tail = new CoolStudent();
        head.setNext(tail);
    }
    public boolean isEmpty(){
        return head.getNext() == tail;
    }
    public void add(){
        CoolStudent tmp = new CoolStudent();
        tmp.inputInfo();
        CoolStudent current = this.head;
        while (current.getNext() != tail){
            current = current.getNext();
        }
        tail.setPrevious(tmp);
        current.setNext(tmp);
        listCount++;
    }
    public void add(int index){
        CoolStudent tmp = new CoolStudent();
        tmp.inputInfo();
        CoolStudent current = head;
        for (int i=1; i<index && current.getNext() != tail; i++){
            current = current.getNext();
        }
        tmp.setNext(current.getNext());
        tmp.setPrevious(current);
        listCount++;
    }
    public Object get(int index){
        if (Math.abs(index) >= listCount) return null;
        CoolStudent current = head.getNext();
        if (index < 0){
            for (int i = 0; i < listCount + index; i++){
                if (current.getNext() == tail) return null;
                current = current.getNext();
            }
        }
        else {
            for (int i = 0; i < index; i++) {
                if (current.getNext() == tail) return null;
                current = current.getNext();
            }
        }
        return current.getData();
    }
    public void remove(int index){
        if (Math.abs(index) >= listCount) return;
        CoolStudent current = head;
        if (index < 0){
            for (int i = 0; i < listCount + index; i++){
                if (current.getNext() == tail) return;
                current = current.getNext();
            }
        }
        else {
            for (int i = 0; i < index; i++) {
                if (current.getNext() == tail) return;
                current = current.getNext();
            }
        }
        if (index == listCount-1 || index == -1){
            current.setNext(tail);
        }else{
            current.setNext(current.getNext().getNext());
        }
        listCount--;
    }
    public void clear(){
        head.setNext(tail);
    }
    public int size(){ return listCount; }
    @Override
    public String toString() {
        if (head.getNext() == tail){
            return "всех студентов отчислили";
        }else {
            CoolStudent current = head.getNext();
            String output = "";
            while (current != tail){
                output += "[" + current.getData().toString() + "]";
                current = current.getNext(); }
            return output;
        }

    }
}
