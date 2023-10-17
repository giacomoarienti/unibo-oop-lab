# Esercizio con Git, in locale

Per ogni passo,
si annoti in questo file il comando utilizzato ed il suo output,
per confrontarlo con le soluzioni.

### Si crei una nuova directory
`mkdir deleteme`

### Si inizializzi un repository Git dentro la cartella suddetta.
`cd deleteme`

`git init`
```
Initialized empty Git repository in /mnt/c/Users/giacomo.arienti2/Desktop/OOP/unibo-oop-lab/lab-04/43-git/deleteme/.git/
```

### Si osservi lo stato del repository
`git status`
```
On branch master

No commits yet

nothing to commit (create/copy files and use "git add" to track)
```

### Si scriva un file `HelloWorld.java` contenente un `main` con una stampa a video e si osservi il contenuto del repository
`touch HelloWorld.java`

`ls`
```
HelloWorld.java
```

### Si aggiunga `HelloWorld.java` allo stage, e si osservi lo stato del repository
`git add HelloWorld.java`

`git status`
```
On branch master

No commits yet

Changes to be committed:
  (use "git rm --cached <file>..." to unstage)
        new file:   HelloWorld.java
```

### Si crei il primo commit, con messaggio ragionevole. Se necessario, si configuri nome utente ed email di git usando i dati dell'account istituzionale.
`git commit -m "first commit"`
```
[master (root-commit) 81cc816] first commit
 1 file changed, 7 insertions(+)
 create mode 100644 HelloWorld.java
```

### Si compili il file Java e si verifichi lo stato del repository
`javac HelloWorld.java`

`git status`
```
On branch master
Untracked files:
  (use "git add <file>..." to include in what will be committed)
        HelloWorld.class

nothing added to commit but untracked files present (use "git add" to track)
```

### Si noti che c'è un file rigenerabile (`HelloWorld.class`). Si costruisca una lista di file ignorati che ignori tutti i file con estensione `.class`
`echo '*.class' > .gitignore`

### Si osservi lo stato del repository
`git status`
```
On branch master
Untracked files:
  (use "git add <file>..." to include in what will be committed)
        .gitignore

nothing added to commit but untracked files present (use "git add" to track)
```

### Si crei un nuovo commit che tracci il la ignore list, aggiungendo allo stage i file necessari. Si osservi sempre lo stato del repository dopo l'esecuzione di un comando
`git add .gitignore`

`git commit -m "added .gitignore"`
```
git [master f78fa98] added .gitignore
 1 file changed, 1 insertion(+)
 create mode 100644 .gitignore
```
`git status`
```
On branch master
nothing to commit, working tree clean
```

### Si gestiscano i caratteri di fine linea in modo appropriato, creando un file `.gitattributes`
`touch .gitattributes`

`git add .gitattributes`

`git commit -m "added .gitattributes"`
```
[master 088edbe] added .gitattributes
 1 file changed, 4 insertions(+)
 create mode 100644 .gitattributes
```

### Si osservi la storia del repository usando `git log --all --graph`
`git log --all --graph`
```
* commit 088edbea771f224dc5d0627216dc105a5d9e0422 (HEAD -`master)`
| Author: Giacomo Arienti <giacomo.arienti2@studio.unibo.it>
| Date:   Tue Oct 17 15:40:20 2023 +0200
|
|     added .gitattributes
|
* commit f78fa982164498a886647ee738120a74fa05e5ec
| Author: Giacomo Arienti <giacomo.arienti2@studio.unibo.it>
| Date:   Tue Oct 17 15:35:34 2023 +0200
|
|     added .gitignore
|
* commit 81cc8165925c7358a79c768b119d74207453c8bd
  Author: Giacomo Arienti <giacomo.arienti2@studio.unibo.it>
  Date:   Tue Oct 17 15:32:47 2023 +0200

      first commit
```

### Da questo punto in poi, prima e dopo ogni comando, ci si assicuri di osservare lo stato del repository con `git status`
`git status`
```
On branch master
nothing to commit, working tree clean
```

### Si crei un file Mistake.java, con contenuto arbitrario, lo si aggiunga al tracker, e si faccia un commit
`touch Mistake.java`

`git add Mistake.java`

`git commit -m "mistake commit"`
```
[master 4138d02] mistake commit
 1 file changed, 5 insertions(+)
 create mode 100644 Mistake.java
```

### Si rinomini `Mistake.java` in `ToDelete.java`, e si faccia un commit che registra la modifica
`mv Mistake.java ToDelete.java`

`git add ToDelete.java Mistake.java`

`git commit -m "modified Mistake.java to ToDelete.java"`
```
[master dbe5ac3] modified Mistake.java to ToDelete.java
 1 file changed, 0 insertions(+), 0 deletions(-)
 rename Mistake.java =`ToDelete.java (100%)`
```

### Si elimini `ToDelete.java` e si registri la modifica in un commit
`rm ToDelete.java`

`git add ToDelete.java`

`git commit -m "removed ToDelete.java"`
```
[master c7cbc4e] removed ToDelete.java
 1 file changed, 5 deletions(-)
 delete mode 100644 ToDelete.java
```

### Si osservi la storia del repository e si identifichi il commit dove è stato creato `Mistake.java`. Per una visione compatta, si usi l'opzione `--oneline`
`git log --oneline`
```
c7cbc4e (HEAD -`master) removed ToDelete.java`
dbe5ac3 modified Mistake.java to ToDelete.java
4138d02 mistake commit
088edbe added .gitattributes
f78fa98 added .gitignore
81cc816 first commit
```

### Si ripristini Mistake.java dal commit identificato al passo precedente
`git checkout HEAD~2 -- Mistake.java`

### Si rimuova il file ripristinato e si ripulisca lo stage
`rm Mistake.java`

`git reset Mistake.java`
```
Saved working directory and index state WIP on master: c7cbc4e removed ToDelete.java
```

### Si torni al commit precedente a quello in cui `Mistake.java` è stato creato. Si utilizzi la storia del repository se utile.
`git checkout 088edbe`