const { Product } = require('./Product');
const { Pricing } = require('./Pricing');
const { Specs } = require('./Specs');
const { DeliveryInfo } = require('./DeliveryInfo');
const { Rating } = require('./Rating');

class BrandFactory {
  createProduct() {}
  createPricing() {}
  createSpecs() {}
  createDeliveryInfo() {}
  createRating() {}
}
module.exports.BrandFactory = BrandFactory;