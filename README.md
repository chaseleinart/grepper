# Welcome to grepper!

Maybe you're a wiz with your Unix tools like grep. I ought to be, but I use most of them infrequently enough that I resort to looking up documentation or StackOverflow examples every time I need to grep some text. For my level of proficiency with grep, it's easier to write some custom code to parse a file to do what I need.


# ExecutablePatterns

In grepper, an ExecutablePattern is a class you write yourself for parsing a text file. ExecutablePatterns implement a processInput() method, which takes in the contents of a text file, and returns useful information.

## Configure Java classes to be executed against a named text file

grepper makes use of a simple yaml file where you specify the class names corresponding to patterns you'd like to execute against a text file. You're free to write your own patterns and add them to the config as needed for ad-hoc parsing.