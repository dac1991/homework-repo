document.addEventListener('DOMContentLoaded', () => {
    const newItemForm = document.querySelector('#add-new-item-form');
    newItemForm.addEventListener('submit', handleNewItemFormSubmit);

    const deleteAllButton = document.querySelector('#delete-all');
    deleteAllButton.addEventListener('click', handleDeleteAllClick);

    const sortListItems = document.querySelector('#sort');
    sortListItems.addEventListener('click', handleListItemSort);

});

const handleNewItemFormSubmit = function(event){
    event.preventDefault();

    const listItem = createListItem(event.target);
    const laligaPlayerList = document.querySelector('#la-liga-scorers');
    laligaPlayerList.appendChild(listItem);

    event.target.reset();
};


const createListItem = function(form){
    const listItem = document.createElement('li');
    listItem.classList.add('list-item');


    const name = document.createElement('h2');
    name.textContent = form.name.value;
    listItem.appendChild(name);

    const appearances = document.createElement('h3');
    appearances.textContent = `${form.appearances.value} appearances`;
    listItem.appendChild(appearances);

    const goals = document.createElement('h3');
    goals.textContent = `${form.goals.value} goals`;
    listItem.appendChild(goals);

    const team = document.createElement('h3')
    team.textContent = form.team.value;
    listItem.appendChild(team);

    return listItem;
};

const handleDeleteAllClick = function(event){
    const laligaPlayerList = document.querySelector('#la-liga-scorers');
    laligaPlayerList.innerHTML = '';
};


const handleListItemSort = function(event){
    if(event.target.value === 'highest'){
        console.log('highest clicked')
    } else {
        if(event.target.value === 'lowest'){
            console.log('lowest clicked')
        }
    };

};