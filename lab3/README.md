# Introduction to Testing EPAM LAB3

## Функциональное тестирование сайта [WEB QUIK](https://junior.webquik.ru/ )



### 1.*Добавление нового списка*

| Название                                                     | Описание                                                     |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| **Идентификатор**                              	           | 1                                                            |
| **Заголовок**                                                | Добавление нового списка                               	  |
| **Предусловие**                                              | Открыта страница [WEB QUIK'а](https://junior.webquik.ru/) ,совершен вход в аккаунт.|
| **Шаг**                                                      | **Ожидаемый результат**                                      |
| На левой понели нажать  "+".							   | Появления поля для ввода.                 					  |
| Введите удобное дЛЯ вас название списка.		               | Переход на новый список.									  |



### 2.*Добавление нового инструмента*

| Название                                                     | Описание                                                     |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| **Идентификатор**	                                           | 2                                                            |
| **Заголовок**                                                | Добавление нового инструмента                                |
| **Предусловие**                                              | Открыта страница [WEB QUIK'а](https://junior.webquik.ru/) ,совершен вход в аккаунт.|
| **Шаг**                                                      | **Ожидаемый результат**                                      |
| Нажать на кнопку "Добавить новый инструменты",в левой панели.| Откроется панель с вводом.	  								  |
| Ввести необходимое название инструмента и выбрать его.       | Система нашла введенный инструмент и добавила его в список инструментов. |



### 3.*Оформление заявки на покупку акций (рыночная)*

| Название                                                     | Описание                                                     |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| **Идентификатор**                                            | 3                                                            |
| **Заголовок**                                                | Покупка акций			                                      |
| **Предусловие**                                              | Открыта страница [WEB QUIK'а](https://junior.webquik.ru/) ,совершен вход в аккаунт,открыто окно для совершения новой заявки.|
| **Шаг**                                                      | **Ожидаемый результат**                                       |
| Ввести в верхнее поле,наименования акции для покупки.        | В поле отобразилась введенное наименование акции.             |
| Ввести желаемое количество лотов для покупки.				   | В поле "Сумма" отобразилось соотвествующая цена лотов.        |
| Выбрать рыночный тип.                          			   | Появление надписи "Цена за инструмент: рыночная".      	   |
| Нажать на кнопку "отправить заявку".                         | Появилось окно "Подтверждение заявки".                        |
| Потворно нажать на кнопку "отправить заявку".				   | Появленя уведомление об отправки заявки,а также появление этой заявки в блоке заявок. |



### 4.*Оформление заявки на покупку акций (Лимитная)*

| Название                                                     | Описание                                                     |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| **Номер тест-кейса**                                         | 4                                                            |
| **Заголовок**                                                | Оформление заявки на покупку акций (Лимитная)                |
| **Предусловие**                                              | Открыта страница [WEB QUIK'а](https://junior.webquik.ru/) ,совершен вход в аккаунт,открыто окно для совершения новой заявки. |
| **Шаг**                                                      | **Ожидаемый результат**                                      |
| Ввести в верхнее поле,наименования акции для покупки.        | В поле отобразилась введенное наименование акции.            |
| Ввести желаемое количество лотов для покупки.				   | В поле "Сумма" отобразилось соотвествующая цена лотов        |
| Выбрать лимитный тип покупки.                        		   | Появление поля ввода для  "Цена за инструмент:"    		  |
| Ввести желаемое количество.                 		           | Появилась сумма для покупки.		                          |
| Нажать на кнопку "отправить заявку".                         | Появилось окно "Подтверждение заявки".                       |
| Потворно нажать на кнопку "отправить заявку"				   | Появленя уведомление об отправки заявки,а также появление этой заявки в блоке заявок |



### 5.*Оформление заявки на покупку акций (Лимитная) с связной стоп-заявкой*

| Название                                                     | Описание                                                     |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| **Номер тест-кейса**                                         | 5                                                            |
| **Заголовок**                                                | Оформление заявки на покупку акций с стоп заявкой            |
| **Предусловие**                                              | Открыта страница [WEB QUIK'а](https://junior.webquik.ru/) ,совершен вход в аккаунт,открыто окно для совершения новой заявки. |
| **Шаг**                                                      | **Ожидаемый результат**                                      |
| Ввести в верхнее поле,наименования акции для покупки.        | В поле отобразилась введенное наименование акции.            |
| Ввести желаемое количество лотов для покупки.				   | В поле "Сумма" отобразилось соотвествующая цена лотов        |
| Выбрать условный тип покупки.                        		   | Появление поля ввода для  "Цена за инструмент:"    		  |
| Ввести желаемое количество цены.             		           | Появилась сумма для покупки.		                          |
| Включить "стоп-заявку".		               		           | Стали доступну поля для ввода "цена больше или ровна" и "заявка по цене".|
| Нажать на кнопку "отправить заявку".                         | Появилось окно "Подтверждение заявки".                        |
| Потворно нажать на кнопку "отправить заявку"				   | Появленя уведомление об отправки заявки,а также появление этой заявки в блоке заявок.|




### 6.*Оформление заявки на покупку акций (условная) с стоп-лимитом и рыночной ценой*

| Название                                                     | Описание                                                     |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| **Номер тест-кейса**                                         | 6                                                            |
| **Заголовок**                                                | Оформление заявки на покупку акций с "стоп-заявкой"            |
| **Предусловие**                                              | Открыта страница [WEB QUIK'а](https://junior.webquik.ru/) ,совершен вход в аккаунт,открыто окно для совершения новой заявки. |
| **Шаг**                                                      | **Ожидаемый результат**                                      |
| Ввести в верхнее поле,наименования акции для покупки.        | В поле отобразилась введенное наименование акции.            |
| Ввести желаемое количество лотов для покупки.				   | В поле "Сумма" отобразилось соотвествующая цена лотов        |
| Выбрать условный тип покупки.                        		   | Появление checkbox'ов "Стоп-лимит","Трейк-профит" и "Стоп-цена по другому инструменту".|
| Включить "стоп-лимит".                 		           	   | Стали доступну поля для ввода "Если цена больше или ровна" и "По цене".|
| Ввести желаемое значение в поле "Если цена больше или ровна".| Значение успешно ввелось.									  |
| Включить "По рыночной цене".                 		           | Поле "По цене" стало не доступно.							  |
| Нажать на кнопку "отправить заявку".                         | Появилось окно "Подтверждение заявки".                       |
| Потворно нажать на кнопку "отправить заявку"				   | Появленя уведомление об отправки заявки,а также появление этой заявки в блоке заявок.|



### 7.*Оформление заявки на покупку акций (условная) с "тейк-профитом" и рыночной ценой*

| Название                                                     | Описание                                                     |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| **Номер тест-кейса**                                         | 7                                                            |
| **Заголовок**                                                | Оформление заявки на покупку акций с "тейк-профитом"         |
| **Предусловие**                                              | Открыта страница [WEB QUIK'а](https://junior.webquik.ru/) ,совершен вход в аккаунт,открыто окно для совершения новой заявки. |
| **Шаг**                                                      | **Ожидаемый результат**                                      |
| Ввести в верхнее поле,наименования акции для покупки.        | В поле отобразилась введенное наименование акции.            |
| Ввести желаемое количество лотов для покупки.				   | В поле "Сумма" отобразилось соотвествующая цена лотов        |
| Выбрать условный тип покупки.                        		   | Появление checkbox'ов "Стоп-лимит","Трейк-профит" и "Стоп-цена по другому инструменту".|
| Включить "Трейк-профит".                 		           	   | Стали доступну поля для ввода "Если цена меньше или ровна" и "Отступ от минимума".|
| Ввести желаемые значения в поля.							   | Значения успешно ввелись.									  |
| Включить "По рыночной цене".                 		           | Поле "С защитным пределом" стало не доступно.				  |
| Нажать на кнопку "отправить заявку".                         | Появилось окно "Подтверждение заявки".                       |
| Потворно нажать на кнопку "отправить заявку"				   | Появленя уведомление об отправки заявки,а также появление этой заявки в блоке заявок.|



### 8.*Продажа акций (рыночная)*

| Название                                                     | Описание                                                     |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| **Номер тест-кейса**                                         | 8                                                            |
| **Заголовок**                                                | Продажа акций с рыночной ценой.					          |
| **Предусловие**                                              | Открыта страница [WEB QUIK'а](https://junior.webquik.ru/) ,совершен вход в аккаунт,открыто окно для совершения новой заявки. |
| **Шаг**                                                      | **Ожидаемый результат**                                      |
| Ввести в верхнее поле,наименования акции для продажи.        | В поле отобразилась введенное наименование акции.            |
| Ввести желаемое количество лотов для продажи.				   | В поле "Сумма" отобразилось соотвествующая цена лотов        |
| Выбрать "рыночный" тип продажи.                        	   | Появление надписи "Цена за инструмент:рыночная".			  |
| Нажать на кнопку "отправить заявку".                         | Появилось окно "Подтверждение заявки".                       |
| Потворно нажать на кнопку "отправить заявку"				   | Появленя уведомление об отправки заявки,а также появление этой заявки в блоке заявок.|


### 9.*Продажа акций (лимитивная)*

| Название                                                     | Описание                                                     |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| **Номер тест-кейса**                                         | 9                                                            |
| **Заголовок**                                                | Продажа акций с лимитивный типом.					          |
| **Предусловие**                                              | Открыта страница [WEB QUIK'а](https://junior.webquik.ru/) ,совершен вход в аккаунт,открыто окно для совершения новой заявки. |
| **Шаг**                                                      | **Ожидаемый результат**                                      |
| Ввести в верхнее поле,наименования акции для продажи.        | В поле отобразилась введенное наименование акции.            |
| Ввести желаемое количество лотов для продажи.				   | В поле "Сумма" отобразилось соотвествующая цена лотов        |
| Выбрать "лимитивный" тип продажи.                        	   | Появление активного поля "Цена за инструмент:".			  |
| Ввести желаемую цену за инструмент.                      	   | Справа от надписи "Сумма" появилось активное значение.		  |
| Нажать на кнопку "отправить заявку".                         | Появилось окно "Подтверждение заявки".                       |
| Потворно нажать на кнопку "отправить заявку"				   | Появленя уведомление об отправки заявки,а также появление этой заявки в блоке заявок.|



### 10.*Продажа акций (условная) с "стоп-заявкой"*

| Название                                                     | Описание                                                     |
| ------------------------------------------------------------ | ------------------------------------------------------------ |
| **Номер тест-кейса**                                         | 10                                                           |
| **Заголовок**                                                | Продажа акций условного типа.						          |
| **Предусловие**                                              | Открыта страница [WEB QUIK'а](https://junior.webquik.ru/) ,совершен вход в аккаунт,открыто окно для совершения новой заявки. |
| **Шаг**                                                      | **Ожидаемый результат**                                      |
| Ввести в верхнее поле,наименования акции для продажи.        | В поле отобразилась введенное наименование акции.            |
| Ввести желаемое количество лотов для продажи.				   | В поле "Сумма" отобразилось соотвествующая цена лотов        |
| Выбрать "условный" тип продажи.						       | Появление checkbox'ов "Стоп-лимит","Трейк-профит" и "Стоп-цена по другому инструменту".|
| Включить "стоп-лимит".					            	   | Стали доступны поля "Если цена меньше или равна"			  |
| Ввести желаемую цену.                      				   | Значение ввелось без проблем.								  |
| Включить "По рыночнуой цене".                      		   | Поле "По цене" заблокировано.								  |
| Нажать на кнопку "отправить заявку".                         | Появилось окно "Подтверждение заявки".                       |
| Потворно нажать на кнопку "отправить заявку"				   | Появленя уведомление об отправки заявки,а также появление этой заявки в блоке заявок.|


U0189887\03383
