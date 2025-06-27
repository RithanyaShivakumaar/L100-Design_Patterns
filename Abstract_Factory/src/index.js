const { NikeFactory } = require('./brands/nike/NikeFactory');
const { AdidasFactory } = require('./brands/adidas/AdidasFactory');
const { renderBrand } = require('./client/renderBrand');

const nike = new NikeFactory();
const adidas = new AdidasFactory();

renderBrand(nike);
renderBrand(adidas);
