package InterfaceDemo1;

interface Drawable{  
void draw();  
default void msg(){System.out.println("default method");}  
} 