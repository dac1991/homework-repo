
const PangramFinder = function (phrase) {
  this.alphabet = 'qwertyuiopasdfghjklzxcvbnm'.split('');
  this.phrase = phrase.toLowerCase();
}

PangramFinder.prototype.isPangram = function () {

  return this.alphabet.every((letter) => {
    return this.phrase.includes(letter);
  });

}

module.exports = PangramFinder;