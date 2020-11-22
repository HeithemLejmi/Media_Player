# Media_Player

- This project is a part of my training to use/apply the STATE Design Pattern in Java.

- State is a behavioral design pattern that lets an object alter its behavior when its internal state changes. 
It appears as if the object changed its class.
The main idea is that, at any given moment, there’s a finite number of **states** which a program can be in. 
Within any unique state, the program behaves differently, and the program can be switched from one state to another instantaneously. 
However, depending on a current state, the program may or may not switch to certain other states. 
These switching rules, called **transitions**, are also finite and predetermined.;

You can also apply this approach to objects. In this project, we will apply it on a **Player** of media, which could have 3 states: Locked, Ready or Playing.
So, the State design pattern will allow us:
  - To define the behavior of the **Player** at each state: the methods in the **Player** class will behave differently depending on the state of this **Player**.
  - To define the rules of switching from one state to another (from Locked -> Ready -> Playing..)
  - To extract the **responsabilities** of handeling the different aspects of states 
  to the State interface and its implementations in the different state classes: LockedState, ReadyState and PlayingState classes, 
  which will simplify the main class **Player** which will have only one rule : to handle medias.

- In this example, the State pattern lets the same media player, represented by the class **Player** controls behave differently, 
depending on the current playback state. 
The main class of the player : **Player** class contains a reference to a state object called **State**, which performs most of the work for the player. 
Some actions may end-up replacing the state object with another, which changes the way the player reacts to the user interactions.
