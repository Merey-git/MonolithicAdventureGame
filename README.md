# Monolithic Adventure Game

## 🎮 Описание проекта
🔥 Добро пожаловать в **Monolithic Adventure Game** – захватывающее текстовое RPG-приключение! – текстовую RPG, в которой игрок отправляется в захватывающее путешествие, сражается с монстрами, прокачивает свои навыки и собирает ценные артефакты.

Игра построена с учётом принципов **SOLID**, что делает её код гибким, расширяемым и удобным для поддержки.

## 🚀 Запуск игры
1. Склонируйте репозиторий с **GitHub**.
2. Откройте проект в **IntelliJ IDEA** (или любой другой IDE, поддерживающей Java).
3. Запустите `Main.java`, чтобы начать приключение.

## 🏗 Структура проекта
Проект разделён на несколько логических модулей:
- **game** – управляет игровым процессом (`Game.java`).
- **player** – реализация игрового персонажа (`Player.java`).
- **enemies** – абстрактный класс (`Enemy.java`) и его реализации (`Skeleton.java`, `Vampire.java`, `Zombie.java`).
- **combat** – отвечает за сражения (`CombatManager.java`, `CombatManagerImpl.java`).
- **items** – система предметов (`GoldCoin.java`, `HealthElixir.java`, `MagicScroll.java`).
- **level** – управление уровнями (`LevelManager.java`, `LevelManagerImpl.java`).

## 📌 SOLID-принципы в проекте
- **SRP (Принцип единственной ответственности)** – каждый класс отвечает только за свою часть логики.
- **OCP (Принцип открытости/закрытости)** – легко добавлять новых врагов или предметы без изменения старого кода.
- **LSP (Принцип подстановки Барбары Лисков)** – `Enemy` и `Item` используются через интерфейсы, что упрощает замену конкретных реализаций.
- **ISP (Принцип разделения интерфейсов)** – интерфейсы `Enemy`, `Item`, `LevelManager` и `CombatManager` чётко разделены по функционалу.
- **DIP (Принцип инверсии зависимостей)** – высокоуровневые модули зависят от абстракций, а не от конкретных классов.

## 🔧 Улучшения и рефакторинг
При оптимизации кода были внесены следующие изменения:
- Убрано дублирование в `Enemy`.
- В `fight()` добавлен множитель атаки, делающий бои динамичнее.
- Улучшен менеджер уровней и предметов.

## 👤 Автор
Kuanyhskhan Merey

