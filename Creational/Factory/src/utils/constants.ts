export enum ROLES {
  STUDENT = 'student',
  TEACHER = 'teacher',
  RECEPTION = 'reception',
  HELPER = 'helper',
  TRAINER = 'trainer',
}

export interface PersonData {
  role: ROLES;
  name: string;
}
