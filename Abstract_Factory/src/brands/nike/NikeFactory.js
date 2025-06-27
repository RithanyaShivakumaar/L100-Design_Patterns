const { NikeProduct } = require('./NikeProduct');
const { NikePricing } = require('./NikePricing');
const { NikeSpecs } = require('./NikeSpecs');
const { NikeDeliveryInfo } = require('./NikeDeliveryInfo');
const { NikeRating } = require('./NikeRating');

class NikeFactory {
  createProduct() { return new NikeProduct(); }
  createPricing() { return new NikePricing(); }
  createSpecs() { return new NikeSpecs(); }
  createDeliveryInfo() { return new NikeDeliveryInfo(); }
  createRating() { return new NikeRating(); }
}
module.exports.NikeFactory = NikeFactory;
