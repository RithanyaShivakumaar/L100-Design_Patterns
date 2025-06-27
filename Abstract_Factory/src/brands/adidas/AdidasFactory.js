const { AdidasProduct } = require('./AdidasProduct');
const { AdidasPricing } = require('./AdidasPricing');
const { AdidasSpecs } = require('./AdidasSpecs');
const { AdidasDeliveryInfo } = require('./AdidasDeliveryInfo');
const { AdidasRating } = require('./AdidasRating');

class AdidasFactory {
  createProduct() { return new AdidasProduct(); }
  createPricing() { return new AdidasPricing(); }
  createSpecs() { return new AdidasSpecs(); }
  createDeliveryInfo() { return new AdidasDeliveryInfo(); }
  createRating() { return new AdidasRating(); }
}
module.exports.AdidasFactory = AdidasFactory;