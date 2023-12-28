## Модуль описания спецификаций (Specification Module)

### Endpoints

    * CRUDS операции (create, read, update, delete, search) для шаблонов спецификаций (SpecTemplate)
    * CRUDS операции (create, read, update, delete, search) для спецификаций (Spec)

### Описание сущности SpecTemplate

    Id - идентификатор шаблона
    ParentId - идентификатор родительского шаблона
    Role! - роль оборудования на сети (коммутатор, ODN, BaseStation 2G,...)
    Attributes! [
        AttrGroup {
            Id - идентификатор группы атрибутов 
            Name! - наименование группы атрибутов
            Mandatory - флаг обязательности
            Attrs! [{
                id - идентификатор атрибута
                name! - наименование атрибута
                value! - значение атрибута
                type - тип атрибута
            }]
        }
    ]

### Описание сущности Spec

    Id - идентификатор спецификации
    Vendor! - производитель оборудования
    Model! - Наименование модели
    TemplateId! - идентификатор шаблона
    Attributes! [
        AttrGroup {
            Id! - идентификатор группы атрибутов 
            Attrs! [{
                name! - наименование атрибута
                value! - значение атрибута
            }]
        }
    ]