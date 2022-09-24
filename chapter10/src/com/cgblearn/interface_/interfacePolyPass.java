package com.cgblearn.interface_;

public class interfacePolyPass {
    public static void main(String[] args) {
        IH hi = new say();
        Hello hello = new say();
    }

}

interface IH{
    public void hi();
}
interface Hello extends IH{
    public void hello();
}
class say implements Hello{

    @Override
    public void hi() {

    }

    @Override
    public void hello() {

    }
}