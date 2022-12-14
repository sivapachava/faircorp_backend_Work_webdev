INSERT INTO BUILDING(id, name) VALUES(-10, 'Building 1');
INSERT INTO BUILDING(id, name) VALUES(-8, 'Building 2');
INSERT INTO BUILDING(id, name) VALUES(-9, 'Building 3');

INSERT INTO ROOM(id, name, floor, current_temperature, target_temperature,building_id) VALUES(-10, 'Room1', 1, 22.3, 20.0,-10);
INSERT INTO ROOM(id, name, floor,building_id) VALUES(-9, 'Room2', 1,-10);
insert into ROOM(id, name, floor, building_id) values(-8, 'Room3', 1, -10);

INSERT INTO HEATER(id, heater_status, name, power, room_id) VALUES(-10, 'ON', 'Heater1', 2000, -10);
INSERT INTO HEATER(id, heater_status, name, power, room_id) VALUES(-9, 'ON', 'Heater2', null, -10);
INSERT INTO HEATER(id, heater_status, name, power, room_id) VALUES(-8, 'OFF', 'Heater1', 1500, -9);


INSERT INTO RWINDOW(id, window_status, name, room_id) VALUES(-10, 'CLOSED', 'Window 1', -10);
INSERT INTO RWINDOW(id, window_status, name, room_id) VALUES(-9, 'CLOSED', 'Window 2', -10);
INSERT INTO RWINDOW(id, window_status, name, room_id) VALUES(-8, 'OPEN', 'Window 1', -9);
INSERT INTO RWINDOW(id, window_status, name, room_id) VALUES(-7, 'CLOSED', 'Window 2', -9);