/*
Match Whitespace
The challenges so far have covered matching letters of the alphabet and numbers. You can also match the whitespace or spaces between letters.

You can search for whitespace using \s, which is a lowercase s. This pattern not only matches whitespace, but also carriage return, tab, form feed, and new line characters. You can think of it as similar to the character class [ \r\t\f\n\v].

let whiteSpace = "Whitespace. Whitespace everywhere!"
let spaceRegex = /\s/g;
whiteSpace.match(spaceRegex);
This match call would return [" ", " "].

Change the regex countWhiteSpace to look for multiple whitespace characters in a string.

Tests
Passed:Your regex should use the global flag.
Passed:Your regex should use the shorthand character \s to match all whitespace characters.
Passed:Your regex should find eight spaces in the string Men are from Mars and women are from Venus.
Passed:Your regex should find three spaces in the string Space: the final frontier.
Passed:Your regex should find no spaces in the string MindYourPersonalSpace
*/

let sample = "Whitespace is important in separating words";
let countWhiteSpace = /\s/g; // Change this line
let result = sample.match(countWhiteSpace);