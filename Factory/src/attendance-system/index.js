import { ROLES } from './utils/constants.js';
import { AttendanceSystem } from './core/AttendanceSystem.js';
import { AttendanceLogger } from './core/AttendanceLogger.js';

const peopleToCheckIn = [
  { role: ROLES.STUDENT, name: 'Alice' },
  { role: ROLES.TEACHER, name: 'Mr. John' },
  { role: ROLES.RECEPTION, name: 'Maya' },
  { role: ROLES.HELPER, name: 'Raj' },
  { role: ROLES.TRAINER, name: 'Dr. Sharma' },
];

AttendanceSystem.checkInAll(peopleToCheckIn);
AttendanceLogger.exportLogsToConsole();
