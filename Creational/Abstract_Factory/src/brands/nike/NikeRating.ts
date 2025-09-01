import { IRating } from '../../interfaces/Rating';

export class NikeRating implements IRating {
  getRatingValue(): number {
    return 4.7;
  }

  getTotalReviews(): number {
    return 1350;
  }
}
