class NikeDeliveryInfo {
  getDeliveryModes() { return ["Standard", "Express"]; }
  getETA() { return "3–5 Business Days"; }
  getSizesAvailable() { return ["7", "8", "9", "10", "11"]; }
  getReturnPolicy() { return "10-day return policy"; }
}
module.exports.NikeDeliveryInfo = NikeDeliveryInfo;