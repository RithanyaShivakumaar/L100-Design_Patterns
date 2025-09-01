import { NikeFactory } from './brands/nike/NikeFactory';
import { AdidasFactory } from './brands/adidas/AdidasFactory';
import { renderBrand } from './client/renderBrand';

const nike = new NikeFactory();
const adidas = new AdidasFactory();

renderBrand(nike);
renderBrand(adidas);
