const IsogramFinder = function (word) {
    this.word = word.toLowerCase().split('');
}

IsogramFinder.prototype.isIsogram = function () {

    return this.word.every((letter, index, array) => {
        return array.indexOf(letter) === index;
    });
}

module.exports = IsogramFinder;