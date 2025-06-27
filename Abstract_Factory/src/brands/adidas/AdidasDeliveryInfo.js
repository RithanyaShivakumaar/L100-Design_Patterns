class AdidasDeliveryInfo {
  getDeliveryModes() { return ["Standard", "Next-Day"]; }
  getETA() { return "2–4 Business Days"; }
  getSizesAvailable() { return ["5", "6", "7", "8"]; }
  getReturnPolicy() { return "15-day return policy"; }
}
module.exports.AdidasDeliveryInfo = AdidasDeliveryInfo;