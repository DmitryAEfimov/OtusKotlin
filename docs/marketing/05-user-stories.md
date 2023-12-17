## Пользовательские истории

### Конфигурация атрибутивного состава 

В качестве администратора сервиса, я хочу иметь возможность создания групп атрибутов и типов оборудования
    
    1. Сценарий: Работа с типами оборудования
        - Типы оборудования образуют иерархию наследования
        - Дочерний тип оборудования наследует все классы атрибутов, определенные в родительском типе
        - Дочерний тип оборудования не может переопределять группы атрибутов, определенные в родительском типе, а только вводить новые

    2. Сценарий: Работа с группами атрибутов
        - Запрещено дублирование группы атрибутов в одной иерархии типов оборудования
        - Группа атрибутов должна быть уникальна

В качестве администратора сервиса, я хочу иметь возможность ввода новых моделей оборудования
    
    1. Сценарий: Создание модели оборудования
        - Модель оборудования должна иметь привязку к типу оборудования
        - К модели оборудования можно привязать группу атрибутов целиком, запрещено добавление отдельных атрибутов
        - Уникальность модели оборудования определяется по паре Производитель-Наименование модели
        - Все обязательные атрибуты модели должны быть заполнены перед сохранением
    