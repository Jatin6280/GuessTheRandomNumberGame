# GuessTheRandomNumberGame
A console-based Java game built to master OOPs and loop logic.
# Guess The Random Number Game 🎮

A robust, console-based Java application built during my pre-college gap to master object-oriented programming (OOP), conditional structures, and input loop execution.

## 🚀 How It Works
- The system generates a cryptographically secure random number between `1` and `100`.
- The player is prompted to enter a guess.
- Dynamic boundaries adjust based on the guess to provide relative feedback:
  - **Way too high/low** if the guess is outside a range of 20.
  - **Getting warm** if the guess is within 20 numbers of the target.
- The loop terminates dynamically once the correct answer is supplied.

## 🛠️ Concepts Applied
* Object-Oriented Design (Custom utility classes)
* Flow Control & Scoping (`while` loop execution, nested `if-else` branching)
* User Input Parsing (`java.util.Scanner`)

## 📈 Future Enhancements Planned
- [ ] Add an attempt counter to track user scores.
- [ ] Implement a global high-score system.
- [ ] Transition the CLI architecture to a Graphical User Interface (GUI).
