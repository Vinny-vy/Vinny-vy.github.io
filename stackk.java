import java.util.*;
public class stackll {
Node head;
//Node top=head;
class Node{
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
	}
}
boolean isEmpty() {
	if(head==null)
	{
		return true;
	}
	else {
		return false;
	}
}
void push(int data)
{
	Node new_node= new Node(data);
	if(head==null)
	{
		head=new_node;
	}
	else
	{
		//new_node.next=head;
		//head=new_node;
		Node temp=head;
		head= new_node;
		new_node.next=temp;
		}
}
public void print()
{
	Node current=head;
	while(current.next!=null)
	{
		System.out.println(current.data);
		current=current.next;	
	}
}
public int pop()
{
int pop = Integer.MIN_VALUE;

if(head==null)
{
	System.out.println("underflow");
}
else {
pop=head.data;
head=head.next;
}
return pop;
}
public static void main(String args[])
{
	stackll s=new stackll();
	s.push(1);
	s.push(3);
	s.push(2);
	s.print();
	System.out.println("popped ele"+s.pop());
	s.print();
		
	
}
}
