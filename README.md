# Aufgabe-OOP-2

1

Aufgabe OOP 2

Eröffne einen seperaten Branch in git, um dies Aufgabe zu lösen. Im Anschluss 
kann ein Pull Request in den master branch erfolgen, wo das Code Review 
stattfindet.
Erstelle folgende Klassen:

Eine Klasse Autor:
  - Name
  - Vorname
  - E-Mail Adresse

Eine Klasse Buch
  - Titel
  - Autor
  - Erscheinungsjahr
  - Anzahl Seiten
  - Genre

Die Klassen sollen sicherstellen, dass sie nur sinnvolle Werte akzeptieren. 
Sämtliche Werte sollen mittels einem Konstruktor initialisiert werden.
Erstelle ein kurzes Demoskript, das die Methoden aufruft und die Funktionalität 
zeigt.

Stelle danach mit Unittests sicher, dass die Methoden deiner Klassen 
funktionieren wie sie sollen.

Ich will danach folgenden Code ausführen können:
<?php
$autor = new Author(....);
$book = new Book(....);
echo $book->getAuthor()->getEmail();
Ausgabe (z.b): florian.eberle@competec.ch
