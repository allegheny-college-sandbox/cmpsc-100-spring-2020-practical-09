# CMPSC 100-02 Practical Session 9

* Assigned: 30 March 2020
* Due: 8 April 2020 by 11:00 AM
* Point value: 10

In this practical session we explore `iterators` and `while` loops and their role in completing moderately complex tasks.

* [Slack](https://cmpsc-100-02-sp-2020.slack.com)
* [GitHub](https://www.github.com)
* git
* Markdown
* [Atom](https://atom.io)
* [Docker](https://www.docker.com/products/docker-desktop)
* GatorGrader
* gradle

## Table of contents

* [Evaluation](#evaluation)
* [Accepting the assignment](#accepting-the-assignment)
* [A Common Language](#a-common-language)
* [GatorGrader](#gatorgrader)

## General guidelines for practical sessions

* **Experiment!** We design practical sessions to create a space for you to _try things_. Given the expertise of our classroom TLs and my interest in fixing stuff, I am sure that even if something breaks, we can fix it.
* **Complete _something_.** Grading for practical assignments hinges on _completion_. As long as you provide a good faith effort to finish a task, your grade should reflect your effort.
* **Practice skills.** If you work in the discipline of computer science, many of the skills you revisit or establish here are industry standard practice. Learning and practicing them often helps prepare you for either other classes or professional work.
* **Try to finish during the class session** While I provide extra time to complete the work, these assignments can be completed in 50 minutes. This will help you develop your awareness and management of time.
* **Help one another!** We're a community of users here, not competitors. If you grasp something quickly, but a neighbor does not, offer to help them after they've tried for a bit. Conversely, _ask for help_ from either me, our TLs, or your neighbor.

## Evaluation

Practical assignments are evaluated based on an honest attempt at completion. As long as I can see a clear effort to complete the work, you will recieve credit for this assignment.

## Accepting the assignment

- [ ] Log into the `#practicals` channel in our class [Slack](https://cmpsc-100-02-sp-2020.slack.com)
- [ ] Click the link provided for the practical assignment and accept it in GitHub classroom
- [ ] Once the assignment finishes building, click the link to go to your personal repository assignment

## "Cloning" a repository

### Using the correct download link

- [ ] On this repository's page, click the `Clone or download` button in the upper right hand corner
    * You may need to scroll up to see it
- [ ] In the upper right corner of the box that appears, click `Use SSH`
- [ ] Copy the link that appears in the textbox below the phrase "Use a password with a protected key"

### Cloning

- [ ] Type `ls` in your terminal window
    * You should be in your `CMPSC100` directory
- [ ] Change directories (`cd`) to your `Practicals` folder
- [ ] Once in the `Practicals` folder, "clone" the repository using the link copied above
   * If I (the instructor) were to clone my own repository, I'd enter (your link will look different):
```
git clone git@github.com:allegheny-college-cmpsc-100-spring-2020/cmpsc-100-spring-2020-practical-09-dluman
```

## A Common Language

Let's get the to the short (er, really long) of it: I've given you a file containing over 20,000 of the most common English-language words. Your job is to do the following:

* Count the number of words in the file
* Find the longest word and the number of letters it contains
* Find the average number of letters in a word

This will involve a `while` loop, an `iterator`, and knowledge gained in this course about objects (particularly `Strings`) and using their methods.

### Note 

This practical features fields you will need to fill in to receive full credit. These look like the following (this is an example, do not fill in)

```
YOUR ANSWER HERE
```

### The output

```
##### total words read
The longest word is: WORD GOES HERE (##) letters long
The average word length is: # letters
````

## Evaluation

For the purposes of this assignment, complete could should:

- [ ] Pass `gradle build` and `gradle -q --console plain run`
    * This ensures both _legible_ and _runnable_ code

### `WordAnalysis.java`

#### For those feeling less than comfortable

- [ ] Implements at least one `while` loop
- [ ] Implements the Scanner as an `iterator`
- [ ] Keeps track of the number of words read
- [ ] Keeps track of the longest word seen
- [ ] Calculates the average number of letters in the words read

#### For those feelings more comfortable

Everything above, plus:

- [ ] Implementing a second `Scanner` to take a number of words to read
    * e.g. rather than read 20,000+ words, a user might be interested in 1000
- [ ] Uses correct logic and a `break` statement to end the `while` loop when the number has been reached

## GatorGrader

### A note about `gradle`

`gradle` is a program which manages our program's many moving parts. It coordinates building, testing, compiling, and running our code -- tasks that will become more complex over the course of the semester in direct proportion to the complexity of our programs. There are two "tasks" that we will use extensively in this course.

#### `gradle build`

`gradle build` compares code against a set of convetions ("best practices") for creating legible code. There are many different standards for doing this, but our department chooses to follow the [Google Style Guide for the Java language](https://google.github.io/styleguide/javaguide.html). This includes such rules as:

* Each "level" of code being indented by 2 spaces
* Not using single-letter identifiers
* Enforcing consistent use of "Javadoc" (and other) comments
* ... and more!

These kinds of standard make reading code much easier, and help folks like our Technical Leaders (and me) read your code to figure out where something isn't going as planned.

#### `gradle run` (and its variants)

`gradle run` (and its counterpart `gradle -q --console plain run`) compile and run our Java programs. Once again, this will become more handy when we start to build projects that require _multiple_ files.

#### `gradle grade`

`gradle grade` runs the GatorGrader application. This application uses grading standards _specific to an assignment_. This means that the grading files created when you accept an assignment are the same ones by which I will evaluate your work: _once you've cloned an assignment, they do not change_.

You will use this command to grade your work before you turn it in, enabling you to know before I grade it what your grade will be.

### Docker `container`

#### Running GatorGrader directly on `container` start

- [ ] `cd` to your `CMPSC100` folder
- [ ] Locate your `cmpsc-100-spring-2020-practical-09` folder and `cd` to it.
    * Remember that if you run `ls -la`, you should see a `.git` folder if you're in the main repository folder.
- [ ] To make sure you're in the right repository, type `pwd` and press `Enter`
    * If you recieve the expected path, you're in the right place!

```
docker run -it --mount type=bind,source="$(pwd)",target="/project" --hostname GatorGrader gatoreducator/dockagator
```

#### Run `gradle` commands in the container`

```
docker run -it --mount type=bind,source="$(pwd)",target="/project" --hostname GatorGrader gatoreducator/dockagator bash
```

- [ ] To `build` your Java work, type `gradle build` at the `command` prompt and press the `Enter` key
- [ ] To `run` your Java work, type `gradle -q --console plain run` at the `command` prompt and press the `Enter` key
- [ ] To `grade` your Java work, type `gradle grade` at the `command` prompt and press the `Enter` key

## Submitting the assignment/saving progress

The GitHub platform is a place to store your work. So, it makes some sense that should be able to _clone_ (download) from it, and push back (upload) to it. Here, we'll learn this second part.

- [ ] `cd` to your `CMPSC100` folder
- [ ] Locate the `cmpsc-100-spring-2020-practical-09` folder and `cd` to it

Once in this folder, we need to tell git that there have been changes.

- [ ] Type `git add .` and press `Enter`
* This tells git to look through the _entire_ folder structure for new changes and "stage" them

- [ ] Type `git commit -m "{Commit message}"` to "label" the commit
* This is typically something like `git commit -m "Fixing a typo"` -- the message in quotes should be as descriptive as possible, while still remaining somewhat short

- [ ] To send all changes to the server, type `git push`
- [ ] At the prompt, input the password associated with the `SSH Key` you created earlier in this exercise (yesterday)

Once the process finishes successfully, we're done!