# 📦 Java Ferragnez Party

A simple Java console application that checks whether a guest is allowed to enter the Ferragnez party.

## 🚀 Features

- Checks if a given name is on the predefined guest list
- Two implementations included:
  - `CheckGuest.java`: Uses a `for` loop
  - `CheckGuestV2.java`: Uses a `while` loop

## 📁 Project Structure

```
java-festa-ferragnez/
├── src/
│   ├── com/
│   │   └── ferragnez/
│   │       └── party/
│   │           ├── CheckGuest.java
│   │           └── CheckGuestV2.java
├── README.md
```

## ⚙️ How to Compile and Run

1️⃣ **Compile**

```bash
cd src
javac com/ferragnez/party/CheckGuest.java
javac com/ferragnez/party/CheckGuestV2.java
```

2️⃣ **Run**

```bash
# Run the version with for loop
java com.ferragnez.party.CheckGuest

# Run the version with while loop
java com.ferragnez.party.CheckGuestV2
```

## 📌 Example

```plaintext
What is your name?
> Dua Lipa
You can enter at the party!
```

```plaintext
What is your name?
> Mattia Zecchinato
You can't enter at the party!
```

## Author

[@Mattia Zecchinato](https://www.github.com/MattiaZecchinato)