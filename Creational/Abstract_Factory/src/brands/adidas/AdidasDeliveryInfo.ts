import { IDeliveryInfo } from '../../interfaces/DeliveryInfo';

export class AdidasDeliveryInfo implements IDeliveryInfo {
  getDeliveryModes(): string[] {
    return ["Standard", "Next-Day"];
  }

  getETA(): string {
    return "2–4 Business Days";
  }

  getSizesAvailable(): string[] {
    return ["5", "6", "7", "8"];
  }

  getReturnPolicy(): string {
    return "15-day return policy";
  }
}
