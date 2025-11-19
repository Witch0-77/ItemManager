# 🛒 Projekt: Menedżer Listy Zakupów (Java)

## 🎯 Cel projektu

Stwórz prosty **program w języku Java**, który pozwala zarządzać listą zakupów.
Użytkownik może dodawać produkty, usuwać je, wyszukiwać, wyświetlać wszystkie oraz **odhaczać kupione produkty po numerze z listy**.

---

## ⚙️ Wymagania
Projekt powinien zawierać trzy klasy/interfejsy:

| Plik | Typ | Opis |
|------|------|------|
| `ItemManager.java` | interfejs | Zawiera definicje metod do zarządzania produktami |
| `Product.java` | klasa | Reprezentuje pojedynczy produkt |
| `ItemManagerImpl.java` | klasa | Implementuje interfejs i logikę aplikacji |

---

## 🧱 Struktura projektu (w IntelliJ IDEA)


```ShoppingListProject/
│
├── src/
│ └── main/
│       └── java/
│           └── shoppingList/
│               ├── ItemManager.java
│               ├── Product.java
│               ├── ItemManagerImpl.java
│ └── test/
│   └── java/
│       └── ItemManagerImplTest.java <-- testy JUnit 5
│
└── README.md
```

---

## ✅ Zadania do wykonania

### 🔹 1. Klasa `Product`
> Reprezentuje pojedynczy produkt na liście zakupów.

#### Pola:
- [ ] `String name`
- [ ] `int quantity`
- [ ] `String category`
- [ ] `boolean purchased`

#### Metody:
- [ ] Konstruktor przyjmujący `name`, `quantity`, `category`  
  → ustaw domyślnie `purchased = false`
- [ ] Gettery i settery do wszystkich pól
- [ ] `void markAsPurchased()`  
  → oznacza produkt jako kupiony (`purchased = true`)
- [ ] `void showProductInfo()`  
  → wyświetla dane produktu w formacie:  
  `"Mleko (2 szt.) - spożywcze [KUPIONE]"` lub `[NIEKUPIONE]`

---

### 🔹 2. Interfejs `ItemManager`
> Definiuje podstawowe operacje na kolekcji produktów.

#### Metody:
- [ ] `void addItem(Product product)`
- [ ] `boolean removeItem(String name)`
- [ ] `Product findItem(String name)`
- [ ] `List<Product> getAllItems()`

---

### 🔹 3. Klasa `ItemManagerImpl`
> Implementuje interfejs `ItemManager` i zarządza kolekcją produktów.

#### Pola:
- [ ] `ArrayList<Product> productList`

#### Metody:
- [ ] Konstruktor inicjujący pustą listę
- [ ] Implementacja wszystkich metod z interfejsu
- [ ] `void showList()`  
  → wyświetla wszystkie produkty z numeracją (np. `1.`, `2.`, `3.`)
- [ ] `void markAsPurchased(int index)`  
  → oznacza produkt o podanym numerze jako kupiony  
  → sprawdza, czy numer jest poprawny (liczenie od 1)

---

### 🔹 4. Testy jednostkowe – **JUnit 5**
> Utwórz testy w klasie `ItemManagerImplTest`.

#### Wymagania:
- [ ] Projekt korzysta z **JUnit 5**
- [ ] Dla każdej klasy powstaje co najmniej 1 test:

##### Testy klasy `Product`
- [ ] test konstruktorów
- [ ] test metody `markAsPurchased()`
- [ ] test metody `showProductInfo()`

##### Testy klasy `ShoppingList`
- [ ] test dodawania produktu (`addItem`)
- [ ] test usuwania produktu (`removeItem`)
- [ ] test wyszukiwania produktu (`findItem`)
- [ ] test odhaczania po numerze (`markAsPurchased`)
- [ ] test wyświetlania listy (`showList`)

🧩 **TODO:**
- [ ] Dociągnij w IntelliJ framework **JUnit 5**
- [ ] Utwórz pakiet `shoppingList`
- [ ] Dodaj klasę `ItemManagerImplTest`
- [ ] Utwórz testy zgodnie z powyższą listą

---

## 🧮 Przykładowe działanie programu (konsola)

Lista zakupów:

Mleko (2 szt.) - spożywcze [NIEKUPIONE]
Chleb (1 szt.) - spożywcze [NIEKUPIONE]
Mydło (3 szt.) - chemia [NIEKUPIONE]

Użytkownik wybiera numer 2 -> produkt "Chleb" oznaczony jako [KUPIONE]

Nowa lista:
Mleko (2 szt.) - spożywcze [NIEKUPIONE]
Chleb (1 szt.) - spożywcze [KUPIONE]
Mydło (3 szt.) - chemia [NIEKUPIONE]


---


## 🏁 Kiedy zadanie uznaje się za ukończone

- [ ] Wszystkie pola i metody zostały zaimplementowane
- [ ] Wszystkie testy w JUnit 5 przechodzą pozytywnie
- [ ] Program kompiluje się i działa poprawnie w IntelliJ IDEA
- [x] README zostało uzupełnione (możesz odhaczyć wykonane sekcje zmieniając puste pole na "x")
