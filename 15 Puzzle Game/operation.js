var size = 4;
var numbers = [];
var input = 3;

function isValidInput() {
	if (input > 2 && input <= 5){
		size = input;
	}
}

function Board() {
    initialize();
    const board = document.createElement("table");
    board.id = "15puzzle";
    board.className = "puzzle";
    document.body.appendChild(board);

    var counter = 0;
    for (let i = 0; i < size; i++) {
        const row = document.createElement("tr");
        for (j = 0; j < size; j++) {
            const cell = document.createElement("td");
            cell.id = counter;
            cell.addEventListener("click", clickHandler);
            row.appendChild(cell);
            counter = counter + 1;
        }
        board.appendChild(row);
    }

    for (let i = 0; i < size * size; i++) {
        var cell = document.getElementById(i);
        if (numbers[i] == size * size) {
            cell.innerHTML = "";
            cell.className = "emptyCell";
        } else {
            cell.innerHTML = numbers[i];
            cell.className = "cell";
        }
    }
}

function initialize() {
    for (let i = 0; i < size ** 2; i++) {
        numbers[i] = i + 1;
    }
    var current = numbers.length,temp,index;
    while (current > 0) {
        index = Math.floor(Math.random() * current);
        current = current - 1;
        temp = numbers[current];
        numbers[current] = numbers[index];
        numbers[index] = temp;
    }
}  

function clickHandler() {
    var eBlockId = checkMove(this.id);
    var target = document.getElementById(this.id);

    if (eBlockId >= 0) {
        target.animate({ backgroundColor: "lightblue" }, 200);
        var text = target.textContent;
        var empty = document.getElementById(eBlockId);
        target.className = "emptyCell";
        target.innerHTML = "";
        empty.className = "cell";
        empty.innerHTML = text;
    } else {
        target.animate({ backgroundColor: "red" }, 400);
    }
    checkWin();
}

function checkMove(id) {
    var flag = -1;
    const topCellId = parseInt(id) - size,
        bottomCellId = parseInt(id) + size,
        rightCellId = parseInt(id) + 1,
        leftCellId = parseInt(id) - 1;
    adjacentId = [topCellId, bottomCellId, rightCellId, leftCellId];

    if (adjacentId[2] % size == 0) {
        adjacentId[2] = - 1;
    } else if (adjacentId[3] % size == size - 1) {
        adjacentId[3] = - 1;
    }

    for (let i = 0; i < adjacentId.length; i++) {
        if (adjacentId[i] <= size ** 2 - 1 && adjacentId[i] >= 0) {
            var cell = document.getElementById(adjacentId[i]);
            if (cell.className == "emptyCell") {
                flag = adjacentId[i];
            }
        }
    }
    return flag;
}

function checkWin(){
    flag = true;
    for(let i = 0; i < size ** 2 - 1; i++){
        var cell = document.getElementById(i);
        if(cell.textContent != i+1){
            flag = false;
        }
    }
	
    if(flag){
        var msg1 = confirm("You solve this puzzle!!! Want to play again?");
    }
	
	if(msg1 == true){
        location.reload()
    }
}