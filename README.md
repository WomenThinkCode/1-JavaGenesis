# BEFORE ANYTHING: Learning How to Git Branch

One of the goals of this repo is to help us practice working with Git like pros — that means using branches, handling merge conflicts, and getting comfortable with real collaboration workflows.

There will be no forking in this organization — we’re getting our hands dirty with the real deal.

# Getting Started
1. Navigate to the github repo you want to work on and copy the SSH key
2. git clone it in your system terminal. It is advisable to do so in a specific directory.
3. Navigate to intellij and click on **File** --> **Open** --> **Relevant directory** --> **Repo**.
4. Once opened, navigate to the terminal and create a new branch:

```bash
wtc@pop-os:~/dump/Creating_java_applications$ git branch
* main

wtc@pop-os:~/dump/Creating_java_applications$ git checkout -b ona
Switched to a new branch 'ona'

wtc@pop-os:~/dump/Creating_java_applications$ git branch
  main
* ona
 
```
(The stars indicate what branch you are working in.)
Now that you are here, you can work on the repo and git commit

```bash
git push --set-upstream origin your-branch-name
```
This tells Git:
"Hey, when I push this branch for the first time, link it to the remote one (on GitHub, for example), and remember it."
So after that, you can just do:
```bash
git push
```

**HAPPY CODING!!🎉**
    
 # Creating java programs
 ## Terminal based outputs + a touch of GUI intro

## Simple java application that prints out a simple statement.

   ```bash
public class First
{
  public static void main(String[] args)
    {
      System.out.println("First java application");
    }
}
```

## Understanding the parts of a typical class

```bash
public class First is the class header.

public is an access specifier. (public means this class can be accessed any where from the application)
The keyword class identifies First as the name of the class.
First is the class name.
Everything between the curly braces {...) is the class body.
```

## Understanding the parts of a typical main() method

```bash
public static void main(String[] args) is the method header.
public is an access specifier. (public means this method can be accessed any where from the application).
static means this method works without instantiating an object (without an object)
void is the method return type (it returns nothing)
main is the method name.
String[] is a class, any arguments to this method  must be an array of string.
The args is the identifier of the array of Strings.
* The formate for a the main method is remains the same!
```

## Understanding the parts of a typical print statement

```bash
System is a class.
out is a field(static variable) of the System class (not dependent on the objects of that class).
println() is a method that prints out the contents within the parenthesis and a new line afterwards. print() does not insert a new line after the contents have been displayed.
The period separates classes, objects and methods.
Every java statement ends with a semicolon(;).
```

## Simple java application that uses GUI for output

```bash
imprt javax.swing.JOptionPane;
public class FirstDialog
  {
    public static void main(String[] args)
      {
        JOptionPane.showMessageDialog(null, "First Java dialog");
      }
  }
```

## Creating a java application that produces GUI(graphical user interface) output

```bash
* You use an import statement when you want to access a built in java class that is contained in a group of classes called package.
  To use the JOptionPane class, you must import the package named javax.swing.JOptionPane.

The showMessageDialog() method displays a graphical window where it displays infomation.
The method requires 2 arguments, the first indicate the location of the message box in the screen and the sceond is the literal string that is displayed.
If the first argument is null, the output message box with be centered in the screen.
```

## Adding comments to a java class
```bash
To add line comments use (//)
To add block comments use (/* content can span over multiple lines*/)
To use javadoc comments use (/** content can span over multiple lines, this content is auto generated */ )
```

# Exercises
```bash
Create a branch and name it using your name and complete the exercises.
Do no not merge with main
On intellij to move through branches use git checkout (branch name you want to checkin to) 
```

## Your first application

1. In a file called exercises.java create an application that prints to the console "exercises World".
2. Create a copy of exercises.java World however this time name it Hello2.java and add comments of your choice to explaining  what each line/statement is doing.
```bash
   Note In java file names and classes must be the same!
```

## Creating a Dialog Box

1. In a file called HelloDialog.java create an application that produces output in dialog box.

## Song Lyrics

1. In file called SongLyrics,java create an application that uses four println() statements to display, four lyrics of your favorite song.

## Tables and chairs
1. In a file called TablesAndChairs.java create an application that displays the pattern shown bellow.
```bash
x                      X  
x                      x  
x      xxxxxxxxxx      x  
xxxxx  x        x  xxxxx  
x   x  x        x  x   x  
x   x  x        x  x   x  
```

## Triangle

1. In a file called Triangle.java create an application that displays the pattern shown below.
```bash
      T  
     TTT  
    TTTTT  
   TTTTTTT  
  TTTTTTTTT  
 TTTTTTTTTTT  
TTTTTTTTTTTTT  
```
## Generating random numbers

1. In a file called RandomGuess.java  create an application that displays two dialog boxes, the first asks the user to think of a number between 1 and 10 and the second displays a randomly generated number.
```bash
   * To generate a random number form 1 to 10 inclusive use the Math.random() function
   * some variable  =  1 + (int) (Math.random() * 10);
```

## Yummy Catering business client
1. In a file called YummyMotto.java create an application that displays Yummy Catering's motto, which is "Yummy makes the food that makes it a party" in a border composed of asterisks
