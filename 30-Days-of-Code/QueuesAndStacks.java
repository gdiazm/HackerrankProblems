class Palindrome {
    LinkedList stack,queue;
    
    Palindrome(){
        this.stack= new LinkedList();
        this.queue= new LinkedList();
    }
    
    void pushCharacter(char c){
        stack.addFirst(c);
    }
    
    void enqueueCharacter(char c){
        queue.addFirst(c);
    }
    
    char popCharacter(){
       return (char) stack.removeFirst();
    }
    
    char dequeueCharacter(){
        return (char) queue.removeLast();
    }

}
